
package net.elec_tronics.block;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.world.inventory.SolarpanelGUIMenu;
import net.elec_tronics.procedures.SolarPanelT1UpdateTickProcedure;
import net.elec_tronics.procedures.SolarPanelT1BlockDestroyedByPlayerProcedure;
import net.elec_tronics.procedures.SolarPanelT1BlockAddedProcedure;
import net.elec_tronics.block.entity.SolarPanelT1BlockEntity;

import java.util.List;
import java.util.Collections;

import io.netty.buffer.Unpooled;

public class SolarPanelT1Block extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SolarPanelT1Block() {
		super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(4f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(15.5, 1.5, 15.5, 16, 16.5, 16), box(0, 16, 15.5, 16, 16.5, 16), box(0, 1.5, 15.5, 0.5, 16.5, 16), box(0, 1.2, 15.5, 16, 1.7, 16), box(0, 3, 14.5, 16, 18.5, 16), box(15.25, 0, 8, 15.5, 15, 8.25),
					box(15.75, 0, 8.75, 16, 15, 9), box(15.25, 0, 8.25, 15.5, 15, 8.5), box(15.5, 0, 7.75, 15.75, 15, 8), box(14, 0, 6, 16, 0.5, 10.5), box(15.75, 0, 7.5, 16, 15, 7.75), box(15.5, 0, 8.5, 15.75, 15, 8.75), box(6, 6, 10, 10, 10, 11.4),
					box(6, 6, 0, 10, 10, 6), box(6, 6, 6, 10, 10, 10), box(0, 6, 6, 6, 10, 10));
			case NORTH -> Shapes.or(box(0, 1.5, 0, 0.5, 16.5, 0.5), box(0, 16, 0, 16, 16.5, 0.5), box(15.5, 1.5, 0, 16, 16.5, 0.5), box(0, 1.2, 0, 16, 1.7, 0.5), box(0, 3, 0, 16, 18.5, 1.5), box(0.5, 0, 7.75, 0.75, 15, 8),
					box(0, 0, 7, 0.25, 15, 7.25), box(0.5, 0, 7.5, 0.75, 15, 7.75), box(0.25, 0, 8, 0.5, 15, 8.25), box(0, 0, 5.5, 2, 0.5, 10), box(0, 0, 8.25, 0.25, 15, 8.5), box(0.25, 0, 7.25, 0.5, 15, 7.5), box(6, 6, 4.6, 10, 10, 6),
					box(6, 6, 10, 10, 10, 16), box(6, 6, 6, 10, 10, 10), box(10, 6, 6, 16, 10, 10));
			case EAST -> Shapes.or(box(15.5, 1.5, 0, 16, 16.5, 0.5), box(15.5, 16, 0, 16, 16.5, 16), box(15.5, 1.5, 15.5, 16, 16.5, 16), box(15.5, 1.2, 0, 16, 1.7, 16), box(14.5, 3, 0, 16, 18.5, 16), box(8, 0, 0.5, 8.25, 15, 0.75),
					box(8.75, 0, 0, 9, 15, 0.25), box(8.25, 0, 0.5, 8.5, 15, 0.75), box(7.75, 0, 0.25, 8, 15, 0.5), box(6, 0, 0, 10.5, 0.5, 2), box(7.5, 0, 0, 7.75, 15, 0.25), box(8.5, 0, 0.25, 8.75, 15, 0.5), box(10, 6, 6, 11.4, 10, 10),
					box(0, 6, 6, 6, 10, 10), box(6, 6, 6, 10, 10, 10), box(6, 6, 10, 10, 10, 16));
			case WEST -> Shapes.or(box(0, 1.5, 15.5, 0.5, 16.5, 16), box(0, 16, 0, 0.5, 16.5, 16), box(0, 1.5, 0, 0.5, 16.5, 0.5), box(0, 1.2, 0, 0.5, 1.7, 16), box(0, 3, 0, 1.5, 18.5, 16), box(7.75, 0, 15.25, 8, 15, 15.5),
					box(7, 0, 15.75, 7.25, 15, 16), box(7.5, 0, 15.25, 7.75, 15, 15.5), box(8, 0, 15.5, 8.25, 15, 15.75), box(5.5, 0, 14, 10, 0.5, 16), box(8.25, 0, 15.75, 8.5, 15, 16), box(7.25, 0, 15.5, 7.5, 15, 15.75), box(4.6, 6, 6, 6, 10, 10),
					box(10, 6, 6, 16, 10, 10), box(6, 6, 6, 10, 10, 10), box(6, 6, 0, 10, 10, 6));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
		SolarPanelT1BlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		SolarPanelT1UpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		SolarPanelT1BlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Solar Panel T1");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new SolarpanelGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SolarPanelT1BlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}

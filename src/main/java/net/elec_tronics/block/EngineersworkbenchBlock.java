
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.world.inventory.WorkbenchguiMenu;
import net.elec_tronics.procedures.EngineersworkbenchcodeProcedure;
import net.elec_tronics.procedures.EngineersworkbenchBlockDestroyedByPlayerProcedure;
import net.elec_tronics.procedures.EngineersworkbenchBlockAddedProcedure;
import net.elec_tronics.block.entity.EngineersworkbenchBlockEntity;

import java.util.List;
import java.util.Collections;

import io.netty.buffer.Unpooled;

public class EngineersworkbenchBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public EngineersworkbenchBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0, 12, 0, 1, 14, 1), box(0, 3, 0, 1, 11, 1), box(0, 0, 0, 1, 2, 1), box(0, 12, 15, 1, 14, 16), box(0, 3, 15, 1, 11, 16), box(0, 0, 15, 1, 2, 16), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(1, 11, 0, 16, 14, 1), box(1, 12, 14, 16, 14, 15), box(1, 12, 1, 2, 14, 14), box(6, 12.75, 14.75, 6.5, 13.25, 15.5), box(6, 12.75, 15.2, 10, 13.25, 15.5), box(9.5, 12.75, 14.75, 10, 13.25, 15.5),
					box(11, 15, 6, 16, 15.5, 6.5), box(11, 15, 10, 16, 15.5, 10.5), box(11, 15, 8, 16, 15.5, 8.5), box(11, 15, 4, 12, 15.5, 13), box(15.5, 15, 4, 16, 15.5, 13), box(11, 15, 12, 15.5, 15.5, 13), box(11, 15, 3.5, 16, 15.5, 4.5),
					box(13.5, 15, 4, 14, 15.5, 13), box(2, 14.25, 4, 9, 15.25, 11));
			case NORTH -> Shapes.or(box(15, 12, 15, 16, 14, 16), box(15, 3, 15, 16, 11, 16), box(15, 0, 15, 16, 2, 16), box(15, 12, 0, 16, 14, 1), box(15, 3, 0, 16, 11, 1), box(15, 0, 0, 16, 2, 1), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(0, 11, 15, 15, 14, 16), box(0, 12, 1, 15, 14, 2), box(14, 12, 2, 15, 14, 15), box(9.5, 12.75, 0.5, 10, 13.25, 1.25), box(6, 12.75, 0.5, 10, 13.25, 0.8), box(6, 12.75, 0.5, 6.5, 13.25, 1.25),
					box(0, 15, 9.5, 5, 15.5, 10), box(0, 15, 5.5, 5, 15.5, 6), box(0, 15, 7.5, 5, 15.5, 8), box(4, 15, 3, 5, 15.5, 12), box(0, 15, 3, 0.5, 15.5, 12), box(0.5, 15, 3, 5, 15.5, 4), box(0, 15, 11.5, 5, 15.5, 12.5),
					box(2, 15, 3, 2.5, 15.5, 12), box(7, 14.25, 5, 14, 15.25, 12));
			case EAST -> Shapes.or(box(0, 12, 15, 1, 14, 16), box(0, 3, 15, 1, 11, 16), box(0, 0, 15, 1, 2, 16), box(15, 12, 15, 16, 14, 16), box(15, 3, 15, 16, 11, 16), box(15, 0, 15, 16, 2, 16), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(0, 11, 0, 1, 14, 15), box(14, 12, 0, 15, 14, 15), box(1, 12, 14, 14, 14, 15), box(14.75, 12.75, 9.5, 15.5, 13.25, 10), box(15.2, 12.75, 6, 15.5, 13.25, 10), box(14.75, 12.75, 6, 15.5, 13.25, 6.5),
					box(6, 15, 0, 6.5, 15.5, 5), box(10, 15, 0, 10.5, 15.5, 5), box(8, 15, 0, 8.5, 15.5, 5), box(4, 15, 4, 13, 15.5, 5), box(4, 15, 0, 13, 15.5, 0.5), box(12, 15, 0.5, 13, 15.5, 5), box(3.5, 15, 0, 4.5, 15.5, 5),
					box(4, 15, 2, 13, 15.5, 2.5), box(4, 14.25, 7, 11, 15.25, 14));
			case WEST -> Shapes.or(box(15, 12, 0, 16, 14, 1), box(15, 3, 0, 16, 11, 1), box(15, 0, 0, 16, 2, 1), box(0, 12, 0, 1, 14, 1), box(0, 3, 0, 1, 11, 1), box(0, 0, 0, 1, 2, 1), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(15, 11, 1, 16, 14, 16), box(1, 12, 1, 2, 14, 16), box(2, 12, 1, 15, 14, 2), box(0.5, 12.75, 6, 1.25, 13.25, 6.5), box(0.5, 12.75, 6, 0.8, 13.25, 10), box(0.5, 12.75, 9.5, 1.25, 13.25, 10),
					box(9.5, 15, 11, 10, 15.5, 16), box(5.5, 15, 11, 6, 15.5, 16), box(7.5, 15, 11, 8, 15.5, 16), box(3, 15, 11, 12, 15.5, 12), box(3, 15, 15.5, 12, 15.5, 16), box(3, 15, 11, 4, 15.5, 15.5), box(11.5, 15, 11, 12.5, 15.5, 16),
					box(3, 15, 13.5, 12, 15.5, 14), box(5, 14.25, 2, 12, 15.25, 9));
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
		if (player.getInventory().getSelected().getItem() instanceof AxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
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
		world.scheduleTick(pos, this, 1);
		EngineersworkbenchBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		EngineersworkbenchcodeProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		EngineersworkbenchBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Engineers Workbench");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new WorkbenchguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
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
		return new EngineersworkbenchBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof EngineersworkbenchBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}
}

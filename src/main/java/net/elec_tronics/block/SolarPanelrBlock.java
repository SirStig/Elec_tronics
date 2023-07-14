
package net.elec_tronics.block;

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
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.procedures.SolarPanelrOnBlockRightClickedProcedure;
import net.elec_tronics.procedures.SolarPanelT1BlockDestroyedByPlayerProcedure;
import net.elec_tronics.procedures.SolarPanelNoneUpdateTickProcedure;
import net.elec_tronics.init.ElecTronicsModBlocks;
import net.elec_tronics.block.entity.SolarPanelrBlockEntity;

import java.util.List;
import java.util.Collections;

public class SolarPanelrBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SolarPanelrBlock() {
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
			default -> Shapes.or(box(0, 3, 14.5, 16, 18.5, 16), box(0, 1.5, 15.5, 0.5, 16.5, 16), box(0, 1.2, 15.5, 16, 1.7, 16), box(15.5, 1.5, 15.5, 16, 16.5, 16), box(0, 16, 15.5, 16, 16.5, 16), box(0, 0, 7.5, 0.25, 15, 7.75),
					box(0.25, 0, 8.5, 0.5, 15, 8.75), box(0.5, 0, 8.25, 0.75, 15, 8.5), box(0.25, 0, 7.75, 0.5, 15, 8), box(0, 0, 6, 2, 0.5, 10.5), box(0, 0, 8.75, 0.25, 15, 9), box(0.5, 0, 8, 0.75, 15, 8.25), box(6, 6, 10, 10, 10, 11.4),
					box(6, 6, 0, 10, 10, 6), box(6, 6, 6, 10, 10, 10), box(10, 6, 6, 16, 10, 10));
			case NORTH -> Shapes.or(box(0, 3, 0, 16, 18.5, 1.5), box(15.5, 1.5, 0, 16, 16.5, 0.5), box(0, 1.2, 0, 16, 1.7, 0.5), box(0, 1.5, 0, 0.5, 16.5, 0.5), box(0, 16, 0, 16, 16.5, 0.5), box(15.75, 0, 8.25, 16, 15, 8.5),
					box(15.5, 0, 7.25, 15.75, 15, 7.5), box(15.25, 0, 7.5, 15.5, 15, 7.75), box(15.5, 0, 8, 15.75, 15, 8.25), box(14, 0, 5.5, 16, 0.5, 10), box(15.75, 0, 7, 16, 15, 7.25), box(15.25, 0, 7.75, 15.5, 15, 8), box(6, 6, 4.6, 10, 10, 6),
					box(6, 6, 10, 10, 10, 16), box(6, 6, 6, 10, 10, 10), box(0, 6, 6, 6, 10, 10));
			case EAST -> Shapes.or(box(14.5, 3, 0, 16, 18.5, 16), box(15.5, 1.5, 15.5, 16, 16.5, 16), box(15.5, 1.2, 0, 16, 1.7, 16), box(15.5, 1.5, 0, 16, 16.5, 0.5), box(15.5, 16, 0, 16, 16.5, 16), box(7.5, 0, 15.75, 7.75, 15, 16),
					box(8.5, 0, 15.5, 8.75, 15, 15.75), box(8.25, 0, 15.25, 8.5, 15, 15.5), box(7.75, 0, 15.5, 8, 15, 15.75), box(6, 0, 14, 10.5, 0.5, 16), box(8.75, 0, 15.75, 9, 15, 16), box(8, 0, 15.25, 8.25, 15, 15.5), box(10, 6, 6, 11.4, 10, 10),
					box(0, 6, 6, 6, 10, 10), box(6, 6, 6, 10, 10, 10), box(6, 6, 0, 10, 10, 6));
			case WEST -> Shapes.or(box(0, 3, 0, 1.5, 18.5, 16), box(0, 1.5, 0, 0.5, 16.5, 0.5), box(0, 1.2, 0, 0.5, 1.7, 16), box(0, 1.5, 15.5, 0.5, 16.5, 16), box(0, 16, 0, 0.5, 16.5, 16), box(8.25, 0, 0, 8.5, 15, 0.25),
					box(7.25, 0, 0.25, 7.5, 15, 0.5), box(7.5, 0, 0.5, 7.75, 15, 0.75), box(8, 0, 0.25, 8.25, 15, 0.5), box(5.5, 0, 0, 10, 0.5, 2), box(7, 0, 0, 7.25, 15, 0.25), box(7.75, 0, 0.5, 8, 15, 0.75), box(4.6, 6, 6, 6, 10, 10),
					box(10, 6, 6, 16, 10, 10), box(6, 6, 6, 10, 10, 10), box(6, 6, 10, 10, 10, 16));
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
		return Collections.singletonList(new ItemStack(ElecTronicsModBlocks.SOLAR_PANEL_T_1.get()));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		SolarPanelNoneUpdateTickProcedure.execute(world, x, y, z);
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
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		SolarPanelrOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SolarPanelrBlockEntity(pos, state);
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
			if (blockEntity instanceof SolarPanelrBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof SolarPanelrBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}

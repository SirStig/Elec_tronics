
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.procedures.EngineersworkbenchBlockDestroyedByPlayerProcedure;
import net.elec_tronics.procedures.EngineersWorkBenchOnBlockRightClickedProcedure;
import net.elec_tronics.init.ElecTronicsModBlocks;
import net.elec_tronics.block.entity.EngineersWorkBenchSideBlockEntity;

import java.util.List;
import java.util.Collections;

public class EngineersWorkBenchSideBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public EngineersWorkBenchSideBlock() {
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
			default -> Shapes.or(box(15, 12, 0, 16, 14, 1), box(15, 3, 0, 16, 11, 1), box(15, 0, 0, 16, 2, 1), box(15, 12, 15, 16, 14, 16), box(15, 3, 15, 16, 11, 16), box(15, 0, 15, 16, 2, 16), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(0, 11, 0, 15, 14, 1), box(0, 12, 14, 15, 14, 15), box(14, 12, 1, 15, 14, 15), box(6, 12.75, 14.75, 6.5, 13.25, 15.5), box(6, 12.75, 15.2, 10, 13.25, 15.5), box(9.5, 12.75, 14.75, 10, 13.25, 15.5),
					box(0, 15, 6, 4, 15.5, 6.5), box(0, 15, 10, 4, 15.5, 10.5), box(0, 15, 8, 4, 15.5, 8.5), box(0, 15, 4, 0.5, 15.5, 13), box(0.5, 15, 12, 5, 15.5, 13), box(2, 15, 4, 2.5, 15.5, 13), box(4, 15, 4, 5, 15.5, 13),
					box(0, 15, 3.5, 5, 15.5, 4.5), box(7, 14.25, 5, 13, 15.25, 12));
			case NORTH -> Shapes.or(box(0, 12, 15, 1, 14, 16), box(0, 3, 15, 1, 11, 16), box(0, 0, 15, 1, 2, 16), box(0, 12, 0, 1, 14, 1), box(0, 3, 0, 1, 11, 1), box(0, 0, 0, 1, 2, 1), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(1, 11, 15, 16, 14, 16), box(1, 12, 1, 16, 14, 2), box(1, 12, 1, 2, 14, 15), box(9.5, 12.75, 0.5, 10, 13.25, 1.25), box(6, 12.75, 0.5, 10, 13.25, 0.8), box(6, 12.75, 0.5, 6.5, 13.25, 1.25),
					box(12, 15, 9.5, 16, 15.5, 10), box(12, 15, 5.5, 16, 15.5, 6), box(12, 15, 7.5, 16, 15.5, 8), box(15.5, 15, 3, 16, 15.5, 12), box(11, 15, 3, 15.5, 15.5, 4), box(13.5, 15, 3, 14, 15.5, 12), box(11, 15, 3, 12, 15.5, 12),
					box(11, 15, 11.5, 16, 15.5, 12.5), box(3, 14.25, 4, 9, 15.25, 11));
			case EAST -> Shapes.or(box(0, 12, 0, 1, 14, 1), box(0, 3, 0, 1, 11, 1), box(0, 0, 0, 1, 2, 1), box(15, 12, 0, 16, 14, 1), box(15, 3, 0, 16, 11, 1), box(15, 0, 0, 16, 2, 1), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(0, 11, 1, 1, 14, 16), box(14, 12, 1, 15, 14, 16), box(1, 12, 1, 15, 14, 2), box(14.75, 12.75, 9.5, 15.5, 13.25, 10), box(15.2, 12.75, 6, 15.5, 13.25, 10), box(14.75, 12.75, 6, 15.5, 13.25, 6.5),
					box(6, 15, 12, 6.5, 15.5, 16), box(10, 15, 12, 10.5, 15.5, 16), box(8, 15, 12, 8.5, 15.5, 16), box(4, 15, 15.5, 13, 15.5, 16), box(12, 15, 11, 13, 15.5, 15.5), box(4, 15, 13.5, 13, 15.5, 14), box(4, 15, 11, 13, 15.5, 12),
					box(3.5, 15, 11, 4.5, 15.5, 16), box(5, 14.25, 3, 12, 15.25, 9));
			case WEST -> Shapes.or(box(15, 12, 15, 16, 14, 16), box(15, 3, 15, 16, 11, 16), box(15, 0, 15, 16, 2, 16), box(0, 12, 15, 1, 14, 16), box(0, 3, 15, 1, 11, 16), box(0, 0, 15, 1, 2, 16), box(0, 2, 0, 16, 3, 16), box(0, 11, 0, 16, 12, 16),
					box(0, 14, 0, 16, 15, 16), box(15, 11, 0, 16, 14, 15), box(1, 12, 0, 2, 14, 15), box(1, 12, 14, 15, 14, 15), box(0.5, 12.75, 6, 1.25, 13.25, 6.5), box(0.5, 12.75, 6, 0.8, 13.25, 10), box(0.5, 12.75, 9.5, 1.25, 13.25, 10),
					box(9.5, 15, 0, 10, 15.5, 4), box(5.5, 15, 0, 6, 15.5, 4), box(7.5, 15, 0, 8, 15.5, 4), box(3, 15, 0, 12, 15.5, 0.5), box(3, 15, 0.5, 4, 15.5, 5), box(3, 15, 2, 12, 15.5, 2.5), box(3, 15, 4, 12, 15.5, 5),
					box(11.5, 15, 0, 12.5, 15.5, 5), box(4, 14.25, 7, 11, 15.25, 13));
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
		return Collections.singletonList(new ItemStack(ElecTronicsModBlocks.ENGINEERSWORKBENCH.get()));
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
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		EngineersWorkBenchOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new EngineersWorkBenchSideBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}

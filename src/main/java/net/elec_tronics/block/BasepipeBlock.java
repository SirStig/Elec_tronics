
package net.elec_tronics.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.procedures.BasepipeUpdateTickProcedure;
import net.elec_tronics.procedures.BasepipeBlockIsPlacedByProcedure;
import net.elec_tronics.block.entity.BasepipeBlockEntity;

import java.util.List;
import java.util.Collections;

public class BasepipeBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public BasepipeBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(4f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(6, 10, 10, 11, 11, 11), box(5, 5, 10, 10, 6, 11), box(5, 6, 10, 6, 11, 11), box(10, 5, 10, 11, 10, 11), box(6, 10, 5, 11, 11, 6), box(5, 5, 5, 10, 6, 6), box(5, 6, 5, 6, 11, 6), box(10, 5, 5, 11, 10, 6),
					box(6, 6, 6, 10, 7, 10), box(6, 9, 6, 10, 10, 10), box(6, 7, 6, 7, 9, 10));
			case NORTH -> Shapes.or(box(5, 10, 5, 10, 11, 6), box(6, 5, 5, 11, 6, 6), box(10, 6, 5, 11, 11, 6), box(5, 5, 5, 6, 10, 6), box(5, 10, 10, 10, 11, 11), box(6, 5, 10, 11, 6, 11), box(10, 6, 10, 11, 11, 11), box(5, 5, 10, 6, 10, 11),
					box(6, 6, 6, 10, 7, 10), box(6, 9, 6, 10, 10, 10), box(9, 7, 6, 10, 9, 10));
			case EAST -> Shapes.or(box(10, 10, 5, 11, 11, 10), box(10, 5, 6, 11, 6, 11), box(10, 6, 10, 11, 11, 11), box(10, 5, 5, 11, 10, 6), box(5, 10, 5, 6, 11, 10), box(5, 5, 6, 6, 6, 11), box(5, 6, 10, 6, 11, 11), box(5, 5, 5, 6, 10, 6),
					box(6, 6, 6, 10, 7, 10), box(6, 9, 6, 10, 10, 10), box(6, 7, 9, 10, 9, 10));
			case WEST -> Shapes.or(box(5, 10, 6, 6, 11, 11), box(5, 5, 5, 6, 6, 10), box(5, 6, 5, 6, 11, 6), box(5, 5, 10, 6, 10, 11), box(10, 10, 6, 11, 11, 11), box(10, 5, 5, 11, 6, 10), box(10, 6, 5, 11, 11, 6), box(10, 5, 10, 11, 10, 11),
					box(6, 6, 6, 10, 7, 10), box(6, 9, 6, 10, 10, 10), box(6, 7, 6, 10, 9, 7));
			case UP -> Shapes.or(box(5, 10, 10, 10, 11, 11), box(6, 10, 5, 11, 11, 6), box(10, 10, 6, 11, 11, 11), box(5, 10, 5, 6, 11, 10), box(5, 5, 10, 10, 6, 11), box(6, 5, 5, 11, 6, 6), box(10, 5, 6, 11, 6, 11), box(5, 5, 5, 6, 6, 10),
					box(6, 6, 6, 10, 10, 7), box(6, 6, 9, 10, 10, 10), box(9, 6, 7, 10, 10, 9));
			case DOWN -> Shapes.or(box(5, 5, 5, 10, 6, 6), box(6, 5, 10, 11, 6, 11), box(10, 5, 5, 11, 6, 10), box(5, 5, 6, 6, 6, 11), box(5, 10, 5, 10, 11, 6), box(6, 10, 10, 11, 11, 11), box(10, 10, 5, 11, 11, 10), box(5, 10, 6, 6, 11, 11),
					box(6, 6, 9, 10, 10, 10), box(6, 6, 6, 10, 10, 7), box(9, 6, 7, 10, 10, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
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
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		BasepipeBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		BasepipeUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		BasepipeBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new BasepipeBlockEntity(pos, state);
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
			if (blockEntity instanceof BasepipeBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}
}

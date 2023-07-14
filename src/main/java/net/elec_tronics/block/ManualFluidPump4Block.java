
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
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.procedures.ManualFluidPumpUpdateTickProcedure;
import net.elec_tronics.block.entity.ManualFluidPump4BlockEntity;

import java.util.List;
import java.util.Collections;

public class ManualFluidPump4Block extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ManualFluidPump4Block() {
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
			default -> Shapes.or(box(7, 8, 13, 9, 9, 16), box(7, 0, 13, 9, 6, 14), box(9, 0, 11, 10, 9, 13), box(7, 0, 10, 9, 9, 11), box(6, 0, 11, 7, 9, 13), box(7, 9, 11, 9, 10, 13), box(9, 6, 13, 10, 8, 16), box(6, 6, 13, 7, 8, 16),
					box(7, 5, 14, 9, 6, 16), box(7.5, 10.2, -1.2, 8.5, 11.2, 7.8), box(6.5, 13, 11.5, 9, 13.5, 12), box(9, 9, 11, 10, 14, 13), box(6, 9, 11, 7, 14, 13), box(7.8, 9.5, 11.5, 8.3, 13, 12));
			case NORTH -> Shapes.or(box(7, 8, 0, 9, 9, 3), box(7, 0, 2, 9, 6, 3), box(6, 0, 3, 7, 9, 5), box(7, 0, 5, 9, 9, 6), box(9, 0, 3, 10, 9, 5), box(7, 9, 3, 9, 10, 5), box(6, 6, 0, 7, 8, 3), box(9, 6, 0, 10, 8, 3), box(7, 5, 0, 9, 6, 2),
					box(7.5, 10.2, 8.2, 8.5, 11.2, 17.2), box(7, 13, 4, 9.5, 13.5, 4.5), box(6, 9, 3, 7, 14, 5), box(9, 9, 3, 10, 14, 5), box(7.7, 9.5, 4, 8.2, 13, 4.5));
			case EAST -> Shapes.or(box(13, 8, 7, 16, 9, 9), box(13, 0, 7, 14, 6, 9), box(11, 0, 6, 13, 9, 7), box(10, 0, 7, 11, 9, 9), box(11, 0, 9, 13, 9, 10), box(11, 9, 7, 13, 10, 9), box(13, 6, 6, 16, 8, 7), box(13, 6, 9, 16, 8, 10),
					box(14, 5, 7, 16, 6, 9), box(-1.2, 10.2, 7.5, 7.8, 11.2, 8.5), box(11.5, 13, 7, 12, 13.5, 9.5), box(11, 9, 6, 13, 14, 7), box(11, 9, 9, 13, 14, 10), box(11.5, 9.5, 7.7, 12, 13, 8.2));
			case WEST -> Shapes.or(box(0, 8, 7, 3, 9, 9), box(2, 0, 7, 3, 6, 9), box(3, 0, 9, 5, 9, 10), box(5, 0, 7, 6, 9, 9), box(3, 0, 6, 5, 9, 7), box(3, 9, 7, 5, 10, 9), box(0, 6, 9, 3, 8, 10), box(0, 6, 6, 3, 8, 7), box(0, 5, 7, 2, 6, 9),
					box(8.2, 10.2, 7.5, 17.2, 11.2, 8.5), box(4, 13, 6.5, 4.5, 13.5, 9), box(3, 9, 9, 5, 14, 10), box(3, 9, 6, 5, 14, 7), box(4, 9.5, 7.8, 4.5, 13, 8.3));
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
		world.scheduleTick(pos, this, 5);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ManualFluidPumpUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 5);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new ManualFluidPump4BlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}

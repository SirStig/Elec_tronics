
package net.elec_tronics.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.elec_tronics.procedures.T1WireUpdateTickProcedure;
import net.elec_tronics.procedures.T1WireBlockIsPlacedByProcedure;
import net.elec_tronics.init.ElecTronicsModBlocks;
import net.elec_tronics.block.entity.Basewirecon4downBlockEntity;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Basewirecon4downBlock extends Block
		implements

			EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public Basewirecon4downBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BONE_BLOCK).strength(1f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
		setRegistryName("basewirecon_4down");
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return Shapes.or(box(6, 6, 10, 10, 10, 16), box(6, 6, 6, 10, 10, 10), box(6, 6, 0, 10, 10, 6), box(0, 6, 6, 6, 10, 10),
						box(6, 0, 6, 10, 6, 10)).move(offset.x, offset.y, offset.z);
			case NORTH :
				return Shapes.or(box(6, 6, 0, 10, 10, 6), box(6, 6, 6, 10, 10, 10), box(6, 6, 10, 10, 10, 16), box(10, 6, 6, 16, 10, 10),
						box(6, 0, 6, 10, 6, 10)).move(offset.x, offset.y, offset.z);
			case EAST :
				return Shapes.or(box(10, 6, 6, 16, 10, 10), box(6, 6, 6, 10, 10, 10), box(0, 6, 6, 6, 10, 10), box(6, 6, 10, 10, 10, 16),
						box(6, 0, 6, 10, 6, 10)).move(offset.x, offset.y, offset.z);
			case WEST :
				return Shapes.or(box(0, 6, 6, 6, 10, 10), box(6, 6, 6, 10, 10, 10), box(10, 6, 6, 16, 10, 10), box(6, 6, 0, 10, 10, 6),
						box(6, 0, 6, 10, 6, 10)).move(offset.x, offset.y, offset.z);
			case UP :
				return Shapes.or(box(6, 10, 6, 10, 16, 10), box(6, 6, 6, 10, 10, 10), box(6, 0, 6, 10, 6, 10), box(10, 6, 6, 16, 10, 10),
						box(6, 6, 0, 10, 10, 6)).move(offset.x, offset.y, offset.z);
			case DOWN :
				return Shapes.or(box(6, 0, 6, 10, 6, 10), box(6, 6, 6, 10, 10, 10), box(6, 10, 6, 10, 16, 10), box(10, 6, 6, 16, 10, 10),
						box(6, 6, 10, 10, 10, 16)).move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		;
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ElecTronicsModBlocks.T_1_WIRE));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.getBlockTicks().scheduleTick(pos, this, 5);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		T1WireBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		T1WireUpdateTickProcedure.execute(world, x, y, z);
		world.getBlockTicks().scheduleTick(pos, this, 5);
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		T1WireBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new Basewirecon4downBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(ElecTronicsModBlocks.BASEWIRECON_4DOWN, renderType -> renderType == RenderType.cutout());
	}
}

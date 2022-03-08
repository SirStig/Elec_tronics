
package net.elec_tronics.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.elec_tronics.procedures.TankUpdateTickProcedure;
import net.elec_tronics.procedures.TankOnBlockRightClickedProcedure;
import net.elec_tronics.init.ElecTronicsModBlocks;
import net.elec_tronics.block.entity.Tankfull14BlockEntity;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Tankfull14Block extends Block
		implements

			EntityBlock {
	public Tankfull14Block() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.GLASS).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("tankfull_14");
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
		return Shapes.or(box(0, 1, 0, 1, 15, 1), box(0, 1, 15, 1, 15, 16), box(15, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16),
				box(0, 0, 0, 1, 1, 16), box(0, 15, 0, 1, 16, 15), box(15, 0, 0, 16, 1, 15), box(15, 15, 1, 16, 16, 16), box(0, 0, 0, 15, 1, 1),
				box(1, 15, 0, 16, 16, 1), box(1, 0, 15, 16, 1, 16), box(0, 15, 15, 15, 16, 16), box(2, 1, 14, 14, 2, 15), box(14, 1, 1, 15, 2, 15),
				box(2, 1, 1, 14, 2, 2), box(1, 1, 1, 2, 2, 15), box(14, 2, 14, 15, 14, 15), box(14, 2, 1, 15, 14, 2), box(14, 14, 1, 15, 15, 15),
				box(1, 2, 14, 2, 14, 15), box(1, 2, 1, 2, 14, 2), box(1, 14, 1, 2, 15, 15), box(2, 14, 14, 14, 15, 15), box(2, 14, 1, 14, 15, 2),
				box(1, 1, 0, 15, 15, 1), box(1, 1, 15, 15, 15, 16), box(15, 1, 1, 16, 15, 15), box(0, 1, 1, 1, 15, 15), box(1, 0, 1, 15, 1, 15),
				box(1, 15, 1, 15, 16, 15), box(2, 1.1, 1.1, 14.8, 15.2, 14.9)).move(offset.x, offset.y, offset.z);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ElecTronicsModBlocks.TANK));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.getBlockTicks().scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		TankUpdateTickProcedure.execute(world, x, y, z);
		world.getBlockTicks().scheduleTick(pos, this, 1);
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

		TankOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new Tankfull14BlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(ElecTronicsModBlocks.TANKFULL_14, renderType -> renderType == RenderType.cutout());
	}

}

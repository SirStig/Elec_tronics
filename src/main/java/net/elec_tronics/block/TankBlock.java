
package net.elec_tronics.block;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
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

import net.elec_tronics.world.inventory.TankT1GUIMenuMenu;
import net.elec_tronics.procedures.TankUpdateTickProcedure;
import net.elec_tronics.procedures.TankOnBlockRightClickedProcedure;
import net.elec_tronics.block.entity.TankBlockEntity;

import java.util.List;
import java.util.Collections;

import io.netty.buffer.Unpooled;

public class TankBlock extends Block implements EntityBlock {
	public TankBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.GLASS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(0, 1, 0, 1, 15, 1), box(0, 1, 15, 1, 15, 16), box(15, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16), box(0, 0, 0, 1, 1, 16), box(0, 15, 0, 1, 16, 15), box(15, 0, 0, 16, 1, 15), box(15, 15, 1, 16, 16, 16),
				box(0, 0, 0, 15, 1, 1), box(1, 15, 0, 16, 16, 1), box(1, 0, 15, 16, 1, 16), box(0, 15, 15, 15, 16, 16), box(2, 1, 14, 14, 2, 15), box(14, 1, 1, 15, 2, 15), box(2, 1, 1, 14, 2, 2), box(1, 1, 1, 2, 2, 15), box(14, 2, 14, 15, 14, 15),
				box(14, 2, 1, 15, 14, 2), box(14, 14, 1, 15, 15, 15), box(2, 1, 14, 14, 2, 15), box(14, 1, 1, 15, 2, 15), box(2, 1, 1, 14, 2, 2), box(1, 1, 1, 2, 2, 15), box(1, 2, 14, 2, 14, 15), box(1, 2, 1, 2, 14, 2), box(1, 14, 1, 2, 15, 15),
				box(2, 14, 14, 14, 15, 15), box(2, 14, 1, 14, 15, 2), box(6, 6, 0, 7, 8, 2), box(6, 8, 0, 10, 9, 2), box(6, 5, 0, 10, 6, 2), box(9, 6, 0, 10, 8, 2), box(7, 6, 1, 9, 8, 2), box(6, 8, 14, 10, 9, 16), box(6, 5, 14, 10, 6, 16),
				box(9, 6, 14, 10, 8, 16), box(6, 6, 14, 7, 8, 16), box(7, 6, 14, 9, 8, 15), box(0, 8, 6, 2, 9, 10), box(0, 5, 6, 2, 6, 10), box(0, 6, 6, 2, 8, 7), box(0, 6, 9, 2, 8, 10), box(1, 6, 7, 2, 8, 9), box(14, 8, 6, 16, 9, 10),
				box(14, 5, 6, 16, 6, 10), box(14, 6, 6, 16, 8, 7), box(14, 6, 9, 16, 8, 10), box(14, 6, 7, 15, 8, 9), box(6, 0, 9, 10, 2, 10), box(6, 0, 6, 10, 2, 7), box(9, 0, 7, 10, 2, 9), box(6, 0, 7, 7, 2, 9), box(7, 1, 7, 9, 2, 9),
				box(6, 14, 9, 10, 16, 10), box(6, 14, 6, 10, 16, 7), box(9, 14, 7, 10, 16, 9), box(6, 14, 7, 7, 16, 9), box(7, 14, 7, 9, 15, 9), box(1, 1, 0, 15, 5, 1), box(1, 9, 0, 15, 15, 1), box(10, 5, 0, 15, 9, 1), box(1, 5, 0, 6, 9, 1),
				box(1, 1, 15, 15, 5, 16), box(1, 9, 15, 15, 15, 16), box(10, 5, 15, 15, 9, 16), box(1, 5, 15, 6, 9, 16), box(15, 1, 1, 16, 5, 15), box(15, 9, 1, 16, 15, 15), box(15, 5, 10, 16, 9, 15), box(15, 5, 1, 16, 9, 6), box(0, 1, 1, 1, 5, 15),
				box(0, 9, 1, 1, 15, 15), box(0, 5, 10, 1, 9, 15), box(0, 5, 1, 1, 9, 6), box(1, 0, 1, 15, 1, 6), box(1, 0, 10, 15, 1, 15), box(10, 0, 6, 15, 1, 10), box(1, 0, 6, 6, 1, 10), box(1, 15, 1, 15, 16, 6), box(1, 15, 10, 15, 16, 15),
				box(10, 15, 6, 15, 16, 10), box(1, 15, 6, 6, 16, 10));
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
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		TankUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Tank");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new TankT1GUIMenuMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
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
		return new TankBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}

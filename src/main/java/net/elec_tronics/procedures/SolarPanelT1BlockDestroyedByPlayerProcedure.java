package net.elec_tronics.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.elec_tronics.network.ElecTronicsModVariables;
import net.elec_tronics.init.ElecTronicsModBlocks;

public class SolarPanelT1BlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double id = 0;
		id = entity.getPersistentData().getDouble("generatorID");
		sx = -2;
		for (int index0 = 0; index0 < 4; index0++) {
			sy = -2;
			for (int index1 = 0; index1 < 4; index1++) {
				sz = -2;
				for (int index2 = 0; index2 < 4; index2++) {
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "generatorID") == id && ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLAR_PANEL_T_1.get()
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLAR_PANELR.get()
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLARPANELTOP.get()
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLARPANELTOPR.get())) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
						if (ElecTronicsModVariables.debug_mode == true) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
										("Removing block at: " + "x" + new java.text.DecimalFormat("##.##").format(x + sx) + "y" + new java.text.DecimalFormat("##.##").format(y + sy) + "z" + new java.text.DecimalFormat("##.##").format(z + sz))),
										false);
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (ElecTronicsModVariables.debug_mode == true) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(
						Component.literal(("Multi-block broken at: " + "x" + new java.text.DecimalFormat("##.##").format(x) + "y" + new java.text.DecimalFormat("##.##").format(y) + "z" + new java.text.DecimalFormat("##.##").format(z))), false);
		}
	}
}

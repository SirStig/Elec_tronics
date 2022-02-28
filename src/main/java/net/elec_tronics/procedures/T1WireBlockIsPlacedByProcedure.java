package net.elec_tronics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class T1WireBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double amount = 0;
		double xcable = 0;
		double xcable2 = 0;
		double xcable3 = 0;
		double xcable4 = 0;
		double xcable5 = 0;
		double xcable6 = 0;
		double ycable = 0;
		double ycable2 = 0;
		double ycable3 = 0;
		double ycable4 = 0;
		double ycable5 = 0;
		double ycable6 = 0;
		double zcable = 0;
		double zcable2 = 0;
		double zcable3 = 0;
		double zcable4 = 0;
		double zcable5 = 0;
		double zcable6 = 0;
		boolean cable1 = false;
		boolean cable2 = false;
		boolean cable3 = false;
		boolean cable4 = false;
		boolean cable5 = false;
		boolean cable6 = false;
		if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock()) == true) {
			amount = amount + 1;
			xcable = x + 1;
			ycable = y;
			zcable = z;
			cable1 = true;
		} else if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()) == true) {
			amount = amount + 1;
			xcable2 = x - 1;
			ycable2 = y;
			zcable2 = z;
			cable2 = true;
		} else if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()) == true) {
			amount = amount + 1;
			xcable3 = x;
			ycable3 = y;
			zcable3 = z + 1;
			cable3 = true;
		} else if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()) == true) {
			amount = amount + 1;
			xcable4 = x;
			ycable4 = y;
			zcable4 = z - 1;
			cable4 = true;
		} else if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) == true) {
			amount = amount + 1;
			xcable5 = x;
			ycable5 = y + 1;
			zcable5 = z;
			cable5 = true;
		} else if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) == true) {
			amount = amount + 1;
			xcable6 = x;
			ycable6 = y + 1;
			zcable6 = z;
			cable6 = true;
		}
	}
}

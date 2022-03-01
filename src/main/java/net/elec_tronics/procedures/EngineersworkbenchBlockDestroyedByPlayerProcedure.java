package net.elec_tronics.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModBlocks;

public class EngineersworkbenchBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -2;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			sy = -2;
			for (int index1 = 0; index1 < (int) (4); index1++) {
				sz = -2;
				for (int index2 = 0; index2 < (int) (4); index2++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
							.getBlock() == ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE
							|| (world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getBlock() == ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE
							|| (world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getBlock() == ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP
							|| (world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getBlock() == ElecTronicsModBlocks.ENGINEERSWORKBENCH) {
						world.setBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), Blocks.AIR.defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}

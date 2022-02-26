package net.elec_tronics.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModBlocks;

public class EngineersworkbenchBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP) {
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
						.getBlock() == ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE) {
					world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
				.getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE.defaultBlockState(),
							3);
					world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP.defaultBlockState(), 3);
					world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z),
							ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE.defaultBlockState(), 3);
				} else {
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			} else {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
		} else {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
	}
}

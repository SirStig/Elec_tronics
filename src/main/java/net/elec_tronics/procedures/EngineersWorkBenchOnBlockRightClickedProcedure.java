package net.elec_tronics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModBlocks;

public class EngineersWorkBenchOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		found = false;
		for (int index0 = 0; index0 < (int) (2); index0++) {
			sy = -1;
			for (int index1 = 0; index1 < (int) (2); index1++) {
				sz = -1;
				for (int index2 = 0; index2 < (int) (2); index2++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
							.getBlock() == ElecTronicsModBlocks.ENGINEERSWORKBENCH) {
						if (entity instanceof Player _player) {
							BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
							_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
									BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}

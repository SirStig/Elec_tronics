package net.elec_tronics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ReturnTimeOfDayProcedure {
	public static double execute(LevelAccessor world) {
		return Math.round(((world.dayTime() + 6000) % 24000) / 1000);
	}
}

package net.elec_tronics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class NightorDayProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world instanceof Level _lvl0 && _lvl0.isDay()) {
			return false;
		}
		return true;
	}
}

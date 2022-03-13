package net.elec_tronics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BrineAdditionalGenerationConditionProcedure {
	public static boolean execute(double y) {
		double fireHeight = 0;
		if (y <= 40) {
			return true;
		}
		return false;
	}
}

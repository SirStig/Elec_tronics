package net.elec_tronics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ElectronicsoilAdditionalGenerationConditionProcedure {
	public static boolean execute(double y) {
		if (y <= 50) {
			return true;
		}
		return false;
	}
}

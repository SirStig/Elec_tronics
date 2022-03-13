package net.elec_tronics.procedures;

public class ElectronicsoilAdditionalGenerationConditionProcedure {
	public static boolean execute(double y) {
		if (y <= 50) {
			return true;
		}
		return false;
	}
}

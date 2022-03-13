package net.elec_tronics.procedures;

public class BrineAdditionalGenerationConditionProcedure {
	public static boolean execute(double y) {
		double fireHeight = 0;
		if (y <= 40) {
			return true;
		}
		return false;
	}
}

package net.elec_tronics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TimeOfDayProcedure {
	public static String execute(LevelAccessor world) {
		double time = 0;
		String timeType = "";
		time = ReturnTimeOfDayProcedure.execute(world);
		if (time >= 12 && !(time < 1)) {
			timeType = "PM";
		} else {
			timeType = "AM";
		}
		if (time > 12) {
			time = time - 12;
		} else if (time == 0) {
			time = 12;
		}
		return "Time: " + (new java.text.DecimalFormat("##").format(time) + "" + timeType);
	}
}

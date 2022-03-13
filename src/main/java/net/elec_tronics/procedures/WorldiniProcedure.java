package net.elec_tronics.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class WorldiniProcedure {
	@SubscribeEvent
	public static void onWorldLoad(WorldEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}

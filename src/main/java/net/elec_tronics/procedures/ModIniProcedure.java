package net.elec_tronics.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import java.io.File;

@Mod.EventBusSubscriber
public class ModIniProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File configfile = new File("");
		File latestversion = new File("");
		com.google.gson.JsonObject config = new com.google.gson.JsonObject();
		com.google.gson.JsonObject version = new com.google.gson.JsonObject();
	}
}

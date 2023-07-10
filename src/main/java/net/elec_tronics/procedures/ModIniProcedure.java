package net.elec_tronics.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.elec_tronics.network.ElecTronicsModVariables;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber
public class ModIniProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		File configfile = new File("");
		com.google.gson.JsonObject config = new com.google.gson.JsonObject();
		configfile = new File((FMLPaths.GAMEDIR.get().toString() + "/config/elec_tronics/"), File.separator + "config.json");
		if (configfile.exists()) {
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(configfile));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					config = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					ElecTronicsModVariables.version = config.get("version").getAsString();
					ElecTronicsModVariables.energy_multiplier = config.get("energy-multiplier").getAsDouble();
					ElecTronicsModVariables.MapVariables.get(world).water_multiplier = config.get("water-multiplier").getAsDouble();
					ElecTronicsModVariables.MapVariables.get(world).syncData(world);
					ElecTronicsModVariables.quarry_speed = config.get("quarry-speed").getAsDouble();
					ElecTronicsModVariables.debug_mode = config.get("debug-mode").getAsBoolean();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			try {
				configfile.getParentFile().mkdirs();
				configfile.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			config.addProperty("version", "0.0.0.9");
			config.addProperty("water-multiplier", 1);
			config.addProperty("energy-multiplier", 1);
			config.addProperty("quarry-speed", 1);
			config.addProperty("debug-mode", false);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(configfile);
					fileWriter.write(mainGSONBuilderVariable.toJson(config));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
	}
}

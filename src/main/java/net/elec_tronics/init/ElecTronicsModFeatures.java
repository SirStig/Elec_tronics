
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.elec_tronics.world.features.ores.UraniumoreFeature;
import net.elec_tronics.world.features.ores.TungstenFeature;
import net.elec_tronics.world.features.ores.RockSaltFeature;
import net.elec_tronics.world.features.ores.BauxiteOreFeature;
import net.elec_tronics.world.features.lakes.ElectronicsoilFeature;
import net.elec_tronics.world.features.lakes.BrineFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(UraniumoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, UraniumoreFeature.GENERATE_BIOMES,
				UraniumoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TungstenFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TungstenFeature.GENERATE_BIOMES,
				TungstenFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ElectronicsoilFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.LAKES, ElectronicsoilFeature.GENERATE_BIOMES,
				ElectronicsoilFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BauxiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BauxiteOreFeature.GENERATE_BIOMES,
				BauxiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BrineFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, BrineFeature.GENERATE_BIOMES, BrineFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RockSaltFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RockSaltFeature.GENERATE_BIOMES,
				RockSaltFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}

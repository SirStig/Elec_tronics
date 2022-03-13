
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.elec_tronics.world.features.ores.UraniumoreFeature;
import net.elec_tronics.world.features.ores.TungstenFeature;
import net.elec_tronics.world.features.ores.RockSaltFeature;
import net.elec_tronics.world.features.ores.BauxiteOreFeature;
import net.elec_tronics.world.features.lakes.ElectronicsoilFeature;
import net.elec_tronics.world.features.lakes.BrineFeature;
import net.elec_tronics.ElecTronicsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ElecTronicsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ElecTronicsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> URANIUMORE = register("uraniumore", UraniumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, UraniumoreFeature.GENERATE_BIOMES, UraniumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TUNGSTEN = register("tungsten", TungstenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TungstenFeature.GENERATE_BIOMES, TungstenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ELECTRONICSOIL = register("electronicsoil", ElectronicsoilFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, ElectronicsoilFeature.GENERATE_BIOMES, ElectronicsoilFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BAUXITE_ORE = register("bauxite_ore", BauxiteOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BauxiteOreFeature.GENERATE_BIOMES, BauxiteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BRINE = register("brine", BrineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, BrineFeature.GENERATE_BIOMES, BrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCK_SALT = register("rock_salt", RockSaltFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RockSaltFeature.GENERATE_BIOMES, RockSaltFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}

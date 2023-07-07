
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.elec_tronics.world.features.ores.UraniumoreFeature;
import net.elec_tronics.world.features.ores.TungstenFeature;
import net.elec_tronics.world.features.ores.RockSaltFeature;
import net.elec_tronics.world.features.ores.BauxiteOreFeature;
import net.elec_tronics.world.features.ElectronicsoilFeatureFeature;
import net.elec_tronics.world.features.BrineFeatureFeature;
import net.elec_tronics.ElecTronicsMod;

@Mod.EventBusSubscriber
public class ElecTronicsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ElecTronicsMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUMORE = REGISTRY.register("uraniumore", UraniumoreFeature::new);
	public static final RegistryObject<Feature<?>> TUNGSTEN = REGISTRY.register("tungsten", TungstenFeature::new);
	public static final RegistryObject<Feature<?>> BAUXITE_ORE = REGISTRY.register("bauxite_ore", BauxiteOreFeature::new);
	public static final RegistryObject<Feature<?>> ROCK_SALT = REGISTRY.register("rock_salt", RockSaltFeature::new);
	public static final RegistryObject<Feature<?>> BRINE_FEATURE = REGISTRY.register("brine_feature", BrineFeatureFeature::new);
	public static final RegistryObject<Feature<?>> ELECTRONICSOIL_FEATURE = REGISTRY.register("electronicsoil_feature", ElectronicsoilFeatureFeature::new);
}

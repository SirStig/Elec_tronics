
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.elec_tronics.fluid.RefinedOilFluid;
import net.elec_tronics.fluid.HydrogenGasFluid;
import net.elec_tronics.fluid.ElectronicsoilFluid;
import net.elec_tronics.fluid.Coolantt1Fluid;
import net.elec_tronics.fluid.ChlorineGasFluid;
import net.elec_tronics.fluid.BrineFluid;
import net.elec_tronics.ElecTronicsMod;

public class ElecTronicsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ElecTronicsMod.MODID);
	public static final RegistryObject<FlowingFluid> OIL = REGISTRY.register("oil", () -> new ElectronicsoilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_OIL = REGISTRY.register("flowing_oil", () -> new ElectronicsoilFluid.Flowing());
	public static final RegistryObject<FlowingFluid> BRINE = REGISTRY.register("brine", () -> new BrineFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BRINE = REGISTRY.register("flowing_brine", () -> new BrineFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CHLORINE_GAS = REGISTRY.register("chlorine_gas", () -> new ChlorineGasFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHLORINE_GAS = REGISTRY.register("flowing_chlorine_gas", () -> new ChlorineGasFluid.Flowing());
	public static final RegistryObject<FlowingFluid> HYDROGEN_GAS = REGISTRY.register("hydrogen_gas", () -> new HydrogenGasFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN_GAS = REGISTRY.register("flowing_hydrogen_gas", () -> new HydrogenGasFluid.Flowing());
	public static final RegistryObject<FlowingFluid> COOLANTT_1 = REGISTRY.register("coolantt_1", () -> new Coolantt1Fluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_COOLANTT_1 = REGISTRY.register("flowing_coolantt_1", () -> new Coolantt1Fluid.Flowing());
	public static final RegistryObject<FlowingFluid> REFINED_OIL = REGISTRY.register("refined_oil", () -> new RefinedOilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_REFINED_OIL = REGISTRY.register("flowing_refined_oil", () -> new RefinedOilFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BRINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BRINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CHLORINE_GAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHLORINE_GAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(HYDROGEN_GAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYDROGEN_GAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COOLANTT_1.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COOLANTT_1.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(REFINED_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_REFINED_OIL.get(), RenderType.translucent());
		}
	}
}

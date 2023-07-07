
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.elec_tronics.fluid.types.HydrogenGasFluidType;
import net.elec_tronics.fluid.types.ElectronicsoilFluidType;
import net.elec_tronics.fluid.types.ChlorineGasFluidType;
import net.elec_tronics.fluid.types.BrineFluidType;
import net.elec_tronics.ElecTronicsMod;

public class ElecTronicsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ElecTronicsMod.MODID);
	public static final RegistryObject<FluidType> ELECTRONICSOIL_TYPE = REGISTRY.register("electronicsoil", () -> new ElectronicsoilFluidType());
	public static final RegistryObject<FluidType> BRINE_TYPE = REGISTRY.register("brine", () -> new BrineFluidType());
	public static final RegistryObject<FluidType> CHLORINE_GAS_TYPE = REGISTRY.register("chlorine_gas", () -> new ChlorineGasFluidType());
	public static final RegistryObject<FluidType> HYDROGEN_GAS_TYPE = REGISTRY.register("hydrogen_gas", () -> new HydrogenGasFluidType());
}

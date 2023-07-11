
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.elec_tronics.world.inventory.WorkbenchguiMenu;
import net.elec_tronics.world.inventory.UpdateMenuMenu;
import net.elec_tronics.world.inventory.TankT1GUIMenuMenu;
import net.elec_tronics.world.inventory.SolarpanelGUIMenu;
import net.elec_tronics.world.inventory.QuarryT1GUIMenu;
import net.elec_tronics.world.inventory.ExtrusinmachineGUIMenu;
import net.elec_tronics.world.inventory.EnergyStorageT1GUIMenu;
import net.elec_tronics.world.inventory.EnergStorageT2Menu;
import net.elec_tronics.world.inventory.CrusherT1GUIMenu;
import net.elec_tronics.world.inventory.CoalgeneratorGUIMenu;
import net.elec_tronics.world.inventory.BlastfurnaceMenu;
import net.elec_tronics.ElecTronicsMod;

public class ElecTronicsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ElecTronicsMod.MODID);
	public static final RegistryObject<MenuType<BlastfurnaceMenu>> BLASTFURNACE = REGISTRY.register("blastfurnace", () -> IForgeMenuType.create(BlastfurnaceMenu::new));
	public static final RegistryObject<MenuType<WorkbenchguiMenu>> WORKBENCHGUI = REGISTRY.register("workbenchgui", () -> IForgeMenuType.create(WorkbenchguiMenu::new));
	public static final RegistryObject<MenuType<CoalgeneratorGUIMenu>> COALGENERATOR_GUI = REGISTRY.register("coalgenerator_gui", () -> IForgeMenuType.create(CoalgeneratorGUIMenu::new));
	public static final RegistryObject<MenuType<CrusherT1GUIMenu>> CRUSHER_T_1_GUI = REGISTRY.register("crusher_t_1_gui", () -> IForgeMenuType.create(CrusherT1GUIMenu::new));
	public static final RegistryObject<MenuType<SolarpanelGUIMenu>> SOLARPANEL_GUI = REGISTRY.register("solarpanel_gui", () -> IForgeMenuType.create(SolarpanelGUIMenu::new));
	public static final RegistryObject<MenuType<ExtrusinmachineGUIMenu>> EXTRUSINMACHINE_GUI = REGISTRY.register("extrusinmachine_gui", () -> IForgeMenuType.create(ExtrusinmachineGUIMenu::new));
	public static final RegistryObject<MenuType<TankT1GUIMenuMenu>> TANKT1GUIMENU = REGISTRY.register("tankt1guimenu", () -> IForgeMenuType.create(TankT1GUIMenuMenu::new));
	public static final RegistryObject<MenuType<EnergStorageT2Menu>> ENERG_STORAGE_T_2 = REGISTRY.register("energ_storage_t_2", () -> IForgeMenuType.create(EnergStorageT2Menu::new));
	public static final RegistryObject<MenuType<EnergyStorageT1GUIMenu>> ENERGY_STORAGE_T_1_GUI = REGISTRY.register("energy_storage_t_1_gui", () -> IForgeMenuType.create(EnergyStorageT1GUIMenu::new));
	public static final RegistryObject<MenuType<QuarryT1GUIMenu>> QUARRY_T_1_GUI = REGISTRY.register("quarry_t_1_gui", () -> IForgeMenuType.create(QuarryT1GUIMenu::new));
	public static final RegistryObject<MenuType<UpdateMenuMenu>> UPDATE_MENU = REGISTRY.register("update_menu", () -> IForgeMenuType.create(UpdateMenuMenu::new));
}

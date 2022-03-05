
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.elec_tronics.world.inventory.WorkbenchguiMenu;
import net.elec_tronics.world.inventory.SolarpanelGUIMenu;
import net.elec_tronics.world.inventory.ExtrusinmachineGUIMenu;
import net.elec_tronics.world.inventory.CrusherT1GUIMenu;
import net.elec_tronics.world.inventory.CoalgeneratorGUIMenu;
import net.elec_tronics.world.inventory.BlastfurnaceMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BlastfurnaceMenu> BLASTFURNACE = register("blastfurnace",
			(id, inv, extraData) -> new BlastfurnaceMenu(id, inv, extraData));
	public static final MenuType<WorkbenchguiMenu> WORKBENCHGUI = register("workbenchgui",
			(id, inv, extraData) -> new WorkbenchguiMenu(id, inv, extraData));
	public static final MenuType<CoalgeneratorGUIMenu> COALGENERATOR_GUI = register("coalgenerator_gui",
			(id, inv, extraData) -> new CoalgeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<CrusherT1GUIMenu> CRUSHER_T_1_GUI = register("crusher_t_1_gui",
			(id, inv, extraData) -> new CrusherT1GUIMenu(id, inv, extraData));
	public static final MenuType<SolarpanelGUIMenu> SOLARPANEL_GUI = register("solarpanel_gui",
			(id, inv, extraData) -> new SolarpanelGUIMenu(id, inv, extraData));
	public static final MenuType<ExtrusinmachineGUIMenu> EXTRUSINMACHINE_GUI = register("extrusinmachine_gui",
			(id, inv, extraData) -> new ExtrusinmachineGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}

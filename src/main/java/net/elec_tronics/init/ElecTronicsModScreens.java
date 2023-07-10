
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.elec_tronics.client.gui.WorkbenchguiScreen;
import net.elec_tronics.client.gui.TankT1GUIMenuScreen;
import net.elec_tronics.client.gui.SolarpanelGUIScreen;
import net.elec_tronics.client.gui.ExtrusinmachineGUIScreen;
import net.elec_tronics.client.gui.EnergyStorageT1GUIScreen;
import net.elec_tronics.client.gui.EnergStorageT2Screen;
import net.elec_tronics.client.gui.CrusherT1GUIScreen;
import net.elec_tronics.client.gui.CoalgeneratorGUIScreen;
import net.elec_tronics.client.gui.BlastfurnaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElecTronicsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ElecTronicsModMenus.BLASTFURNACE.get(), BlastfurnaceScreen::new);
			MenuScreens.register(ElecTronicsModMenus.WORKBENCHGUI.get(), WorkbenchguiScreen::new);
			MenuScreens.register(ElecTronicsModMenus.COALGENERATOR_GUI.get(), CoalgeneratorGUIScreen::new);
			MenuScreens.register(ElecTronicsModMenus.CRUSHER_T_1_GUI.get(), CrusherT1GUIScreen::new);
			MenuScreens.register(ElecTronicsModMenus.SOLARPANEL_GUI.get(), SolarpanelGUIScreen::new);
			MenuScreens.register(ElecTronicsModMenus.EXTRUSINMACHINE_GUI.get(), ExtrusinmachineGUIScreen::new);
			MenuScreens.register(ElecTronicsModMenus.TANKT1GUIMENU.get(), TankT1GUIMenuScreen::new);
			MenuScreens.register(ElecTronicsModMenus.ENERG_STORAGE_T_2.get(), EnergStorageT2Screen::new);
			MenuScreens.register(ElecTronicsModMenus.ENERGY_STORAGE_T_1_GUI.get(), EnergyStorageT1GUIScreen::new);
		});
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.elec_tronics.client.gui.WorkbenchguiScreen;
import net.elec_tronics.client.gui.SolarpanelGUIScreen;
import net.elec_tronics.client.gui.CrusherT1GUIScreen;
import net.elec_tronics.client.gui.CoalgeneratorGUIScreen;
import net.elec_tronics.client.gui.BlastfurnaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElecTronicsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ElecTronicsModMenus.BLASTFURNACE, BlastfurnaceScreen::new);
			MenuScreens.register(ElecTronicsModMenus.WORKBENCHGUI, WorkbenchguiScreen::new);
			MenuScreens.register(ElecTronicsModMenus.COALGENERATOR_GUI, CoalgeneratorGUIScreen::new);
			MenuScreens.register(ElecTronicsModMenus.CRUSHER_T_1_GUI, CrusherT1GUIScreen::new);
			MenuScreens.register(ElecTronicsModMenus.SOLARPANEL_GUI, SolarpanelGUIScreen::new);
		});
	}
}

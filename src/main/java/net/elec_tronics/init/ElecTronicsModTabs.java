
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElecTronicsModTabs {
	public static CreativeModeTab TAB_ELEC_TRONICS_MENU;
	public static CreativeModeTab TAB_ELECTRONICSMACHINES;

	public static void load() {
		TAB_ELEC_TRONICS_MENU = new CreativeModeTab("tabelec_tronics_menu") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElecTronicsModItems.URANIUM_INGOT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ELECTRONICSMACHINES = new CreativeModeTab("tabelectronicsmachines") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElecTronicsModBlocks.ENGINEERSWORKBENCH);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}

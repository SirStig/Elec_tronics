
package net.elec_tronics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.elec_tronics.init.ElecTronicsModTabs;

public class CoolingTowerItem extends Item {
	public CoolingTowerItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cooling_tower");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

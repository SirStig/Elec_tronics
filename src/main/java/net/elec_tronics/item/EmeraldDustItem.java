
package net.elec_tronics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.elec_tronics.init.ElecTronicsModTabs;

public class EmeraldDustItem extends Item {
	public EmeraldDustItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("emerald_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

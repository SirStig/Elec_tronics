
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CreativefluiddropperItem extends Item {

	public CreativefluiddropperItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(1).rarity(Rarity.EPIC));
		setRegistryName("creativefluiddropper");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

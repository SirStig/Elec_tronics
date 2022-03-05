
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class RubberItem extends Item {

	public RubberItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("rubber");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}


package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class RubbersleeveItem extends Item {

	public RubbersleeveItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("rubbersleeve");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

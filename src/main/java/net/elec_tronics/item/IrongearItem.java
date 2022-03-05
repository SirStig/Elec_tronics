
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class IrongearItem extends Item {

	public IrongearItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("irongear");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

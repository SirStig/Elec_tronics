
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OreFunnelItem extends Item {

	public OreFunnelItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ore_funnel");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

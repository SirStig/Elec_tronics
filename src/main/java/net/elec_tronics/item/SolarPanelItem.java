
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SolarPanelItem extends Item {

	public SolarPanelItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("solar_panel");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

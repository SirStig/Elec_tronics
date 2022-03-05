
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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

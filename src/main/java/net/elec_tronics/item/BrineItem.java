
package net.elec_tronics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.elec_tronics.init.ElecTronicsModTabs;
import net.elec_tronics.init.ElecTronicsModFluids;

public class BrineItem extends BucketItem {
	public BrineItem() {
		super(() -> ElecTronicsModFluids.BRINE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU));
		setRegistryName("brine_bucket");
	}
}

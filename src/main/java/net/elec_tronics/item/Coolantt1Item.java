
package net.elec_tronics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.elec_tronics.init.ElecTronicsModFluids;

public class Coolantt1Item extends BucketItem {
	public Coolantt1Item() {
		super(ElecTronicsModFluids.COOLANTT_1, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

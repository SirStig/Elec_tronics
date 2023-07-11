
package net.elec_tronics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.elec_tronics.init.ElecTronicsModFluids;

public class ElectronicsoilItem extends BucketItem {
	public ElectronicsoilItem() {
		super(ElecTronicsModFluids.OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}

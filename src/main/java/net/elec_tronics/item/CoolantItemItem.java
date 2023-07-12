
package net.elec_tronics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CoolantItemItem extends Item {
	public CoolantItemItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}

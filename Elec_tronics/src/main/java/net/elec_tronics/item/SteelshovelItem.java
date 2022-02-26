
package net.elec_tronics.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.elec_tronics.init.ElecTronicsModTabs;
import net.elec_tronics.init.ElecTronicsModItems;

public class SteelshovelItem extends ShovelItem {
	public SteelshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElecTronicsModItems.STEELINGOT));
			}
		}, 1, -3f, new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU));
		setRegistryName("steelshovel");
	}
}

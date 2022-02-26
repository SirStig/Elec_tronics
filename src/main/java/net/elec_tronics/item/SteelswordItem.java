
package net.elec_tronics.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.elec_tronics.init.ElecTronicsModTabs;
import net.elec_tronics.init.ElecTronicsModItems;

public class SteelswordItem extends SwordItem {
	public SteelswordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElecTronicsModItems.STEELINGOT));
			}
		}, 3, -3f, new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU));
		setRegistryName("steelsword");
	}
}

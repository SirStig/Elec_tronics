
package net.elec_tronics.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class IronWrenchItem extends Item {

	public IronWrenchItem() {
		super(new Item.Properties().tab(ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("iron_wrench");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 100;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		IronWrenchRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ());
		return retval;
	}

}

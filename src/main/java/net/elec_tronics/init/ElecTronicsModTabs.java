
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("elec_tronics", "elec_tronics_menu"),
				builder -> builder.title(Component.translatable("item_group.elec_tronics.elec_tronics_menu")).icon(() -> new ItemStack(ElecTronicsModItems.HAND_SAW.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ElecTronicsModItems.URANIUM_INGOT.get());
					tabData.accept(ElecTronicsModItems.URANIUM_DUST.get());
					tabData.accept(ElecTronicsModItems.TUNGSTEN_ORE.get());
					tabData.accept(ElecTronicsModItems.TUNGSTEN_INGOT.get());
					tabData.accept(ElecTronicsModItems.INSULATION.get());
					tabData.accept(ElecTronicsModItems.FIBGER_GLASS_DUST.get());
					tabData.accept(ElecTronicsModItems.STEELINGOT.get());
					tabData.accept(ElecTronicsModItems.STEELPICKAXE.get());
					tabData.accept(ElecTronicsModItems.STEELSWORD.get());
					tabData.accept(ElecTronicsModItems.STEELSHOVEL.get());
					tabData.accept(ElecTronicsModItems.STEELAXE.get());
					tabData.accept(ElecTronicsModItems.STEELHOE.get());
					tabData.accept(ElecTronicsModItems.HAND_SAW.get());
					tabData.accept(ElecTronicsModItems.SCREWDRIVER.get());
					tabData.accept(ElecTronicsModItems.HAMMER.get());
					tabData.accept(ElecTronicsModItems.SHARPENEDIRON.get());
					tabData.accept(ElecTronicsModItems.ASH.get());
					tabData.accept(ElecTronicsModItems.IRONDUST.get());
					tabData.accept(ElecTronicsModBlocks.BASECABLE_T_1.get().asItem());
					tabData.accept(ElecTronicsModItems.TUNGSTEN_DUST.get());
					tabData.accept(ElecTronicsModItems.DIAMOND_DUST.get());
					tabData.accept(ElecTronicsModItems.GOLD_DUST.get());
					tabData.accept(ElecTronicsModItems.EMERALD_DUST.get());
					tabData.accept(ElecTronicsModItems.COPPER_DUST.get());
					tabData.accept(ElecTronicsModItems.QUARTZ_DUST.get());
					tabData.accept(ElecTronicsModItems.RUBBER.get());
					tabData.accept(ElecTronicsModItems.COPPERWIRE.get());
					tabData.accept(ElecTronicsModItems.RUBBERSLEEVE.get());
					tabData.accept(ElecTronicsModItems.TURBINE.get());
					tabData.accept(ElecTronicsModItems.CONDENSOR.get());
					tabData.accept(ElecTronicsModItems.COOLING_TOWER.get());
					tabData.accept(ElecTronicsModItems.GENERATOR.get());
					tabData.accept(ElecTronicsModItems.SOLAR_PANEL.get());
					tabData.accept(ElecTronicsModItems.ELECTRICMOTOR.get());
					tabData.accept(ElecTronicsModItems.ORE_FUNNEL.get());
					tabData.accept(ElecTronicsModItems.GRINDER.get());
					tabData.accept(ElecTronicsModItems.IRONGEAR.get());
					tabData.accept(ElecTronicsModItems.COPPER_SHEET.get());
					tabData.accept(ElecTronicsModItems.WIRE_ROLLER.get());
					tabData.accept(ElecTronicsModBlocks.BASEPIPE.get().asItem());
					tabData.accept(ElecTronicsModItems.OIL_BUCKET.get());
					tabData.accept(ElecTronicsModItems.CREATIVEFLUIDDROPPER.get());
					tabData.accept(ElecTronicsModItems.BAUXITE_INGOT.get());
					tabData.accept(ElecTronicsModItems.STEEL_ARMOR_HELMET.get());
					tabData.accept(ElecTronicsModItems.STEEL_ARMOR_CHESTPLATE.get());
					tabData.accept(ElecTronicsModItems.STEEL_ARMOR_LEGGINGS.get());
					tabData.accept(ElecTronicsModItems.STEEL_ARMOR_BOOTS.get());
					tabData.accept(ElecTronicsModItems.BRINE_BUCKET.get());
					tabData.accept(ElecTronicsModItems.ROCKSALTDUST.get());
					tabData.accept(ElecTronicsModItems.IRON_WRENCH.get());
					tabData.accept(ElecTronicsModBlocks.REFINERY_T_1.get().asItem());
					tabData.accept(ElecTronicsModItems.REFINED_OIL_ITEM.get());
					tabData.accept(ElecTronicsModItems.COOLANT_ITEM.get());
					tabData.accept(ElecTronicsModBlocks.WIRE_T_2.get().asItem());
				}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("elec_tronics", "electronicsmachines"),
				builder -> builder.title(Component.translatable("item_group.elec_tronics.electronicsmachines")).icon(() -> new ItemStack(ElecTronicsModBlocks.T_1_WIRE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ElecTronicsModBlocks.URANIUMORE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.TUNGSTEN.get().asItem());
					tabData.accept(ElecTronicsModBlocks.REINFORCEDBLASTBRICK.get().asItem());
					tabData.accept(ElecTronicsModBlocks.BLASTFURNANCEMACHINE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.ENGINEERSWORKBENCH.get().asItem());
					tabData.accept(ElecTronicsModBlocks.WATERTURBINEMACHINE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.CRUSHERMACHINE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.SOLAR_PANEL_T_1.get().asItem());
					tabData.accept(ElecTronicsModBlocks.EXTRUSION_MACHINE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.ENERGY_STORAGE_T_1.get().asItem());
					tabData.accept(ElecTronicsModBlocks.TANK.get().asItem());
					tabData.accept(ElecTronicsModBlocks.MANUAL_FLUID_PUMP.get().asItem());
					tabData.accept(ElecTronicsModBlocks.BAUXITE_ORE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.BAUXITE_BLOCK.get().asItem());
					tabData.accept(ElecTronicsModBlocks.ROCK_SALT.get().asItem());
					tabData.accept(ElecTronicsModBlocks.COAL_GENERATOR_MACHINE.get().asItem());
					tabData.accept(ElecTronicsModBlocks.QUARRY_T_1.get().asItem());
				}).withSearchBar());
	}
}

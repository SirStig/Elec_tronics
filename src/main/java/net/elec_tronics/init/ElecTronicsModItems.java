
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.elec_tronics.item.UraniumIngotItem;
import net.elec_tronics.item.UraniumDustItem;
import net.elec_tronics.item.TungstenOreItem;
import net.elec_tronics.item.TungstenIngotItem;
import net.elec_tronics.item.SteelswordItem;
import net.elec_tronics.item.SteelshovelItem;
import net.elec_tronics.item.SteelpickaxeItem;
import net.elec_tronics.item.SteelingotItem;
import net.elec_tronics.item.SteelhoeItem;
import net.elec_tronics.item.SteelaxeItem;
import net.elec_tronics.item.SharpenedironItem;
import net.elec_tronics.item.ScrewdriverItem;
import net.elec_tronics.item.IrondustItem;
import net.elec_tronics.item.InsulationItem;
import net.elec_tronics.item.HandSawItem;
import net.elec_tronics.item.HammerItem;
import net.elec_tronics.item.FibgerGlassDustItem;
import net.elec_tronics.item.AshItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item URANIUM_INGOT = register(new UraniumIngotItem());
	public static final Item URANIUMORE = register(ElecTronicsModBlocks.URANIUMORE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item URANIUM_DUST = register(new UraniumDustItem());
	public static final Item TUNGSTEN = register(ElecTronicsModBlocks.TUNGSTEN, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item TUNGSTEN_ORE = register(new TungstenOreItem());
	public static final Item TUNGSTEN_INGOT = register(new TungstenIngotItem());
	public static final Item REINFORCEDBLASTBRICK = register(ElecTronicsModBlocks.REINFORCEDBLASTBRICK, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item INSULATION = register(new InsulationItem());
	public static final Item BLASTFURNANCEMACHINE = register(ElecTronicsModBlocks.BLASTFURNANCEMACHINE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item FIBGER_GLASS_DUST = register(new FibgerGlassDustItem());
	public static final Item STEELINGOT = register(new SteelingotItem());
	public static final Item ENGINEERSWORKBENCH = register(ElecTronicsModBlocks.ENGINEERSWORKBENCH, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item STEELPICKAXE = register(new SteelpickaxeItem());
	public static final Item STEELSWORD = register(new SteelswordItem());
	public static final Item STEELSHOVEL = register(new SteelshovelItem());
	public static final Item STEELAXE = register(new SteelaxeItem());
	public static final Item STEELHOE = register(new SteelhoeItem());
	public static final Item HAND_SAW = register(new HandSawItem());
	public static final Item SCREWDRIVER = register(new ScrewdriverItem());
	public static final Item HAMMER = register(new HammerItem());
	public static final Item SHARPENEDIRON = register(new SharpenedironItem());
	public static final Item WATERTURBINEMACHINE = register(ElecTronicsModBlocks.WATERTURBINEMACHINE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item COALGENERATORMACHINE = register(ElecTronicsModBlocks.COALGENERATORMACHINE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item ASH = register(new AshItem());
	public static final Item CRUSHERMACHINE = register(ElecTronicsModBlocks.CRUSHERMACHINE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item IRONDUST = register(new IrondustItem());
	public static final Item T_1_WIRE = register(ElecTronicsModBlocks.T_1_WIRE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item CABLE_TT_1 = register(ElecTronicsModBlocks.CABLE_TT_1, null);
	public static final Item CABLE_JUNCTION_T_1 = register(ElecTronicsModBlocks.CABLE_JUNCTION_T_1, null);
	public static final Item CABLE_ANGLE_T_1 = register(ElecTronicsModBlocks.CABLE_ANGLE_T_1, null);
	public static final Item ENGINEERS_WORK_BENCH_SIDE = register(ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE, null);
	public static final Item ENGINEERS_WORK_BENCH_TOP = register(ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP, null);
	public static final Item ENGINEERS_WORK_BENCH_TOP_SIDE = register(ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE, null);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}

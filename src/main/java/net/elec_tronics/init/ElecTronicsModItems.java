
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

import net.elec_tronics.item.WireRollerItem;
import net.elec_tronics.item.UraniumIngotItem;
import net.elec_tronics.item.UraniumDustItem;
import net.elec_tronics.item.TurbineItem;
import net.elec_tronics.item.TungstenOreItem;
import net.elec_tronics.item.TungstenIngotItem;
import net.elec_tronics.item.TungstenDustItem;
import net.elec_tronics.item.SteelswordItem;
import net.elec_tronics.item.SteelshovelItem;
import net.elec_tronics.item.SteelpickaxeItem;
import net.elec_tronics.item.SteelingotItem;
import net.elec_tronics.item.SteelhoeItem;
import net.elec_tronics.item.SteelaxeItem;
import net.elec_tronics.item.SteelArmorItem;
import net.elec_tronics.item.SolarPanelItem;
import net.elec_tronics.item.SharpenedironItem;
import net.elec_tronics.item.ScrewdriverItem;
import net.elec_tronics.item.RubbersleeveItem;
import net.elec_tronics.item.RubberItem;
import net.elec_tronics.item.RocksaltdustItem;
import net.elec_tronics.item.QuartzDustItem;
import net.elec_tronics.item.OreFunnelItem;
import net.elec_tronics.item.IrongearItem;
import net.elec_tronics.item.IrondustItem;
import net.elec_tronics.item.IronWrenchItem;
import net.elec_tronics.item.InsulationItem;
import net.elec_tronics.item.HandSawItem;
import net.elec_tronics.item.HammerItem;
import net.elec_tronics.item.GrinderItem;
import net.elec_tronics.item.GoldDustItem;
import net.elec_tronics.item.GeneratorItem;
import net.elec_tronics.item.FibgerGlassDustItem;
import net.elec_tronics.item.EmeraldDustItem;
import net.elec_tronics.item.ElectronicsoilItem;
import net.elec_tronics.item.ElectricmotorItem;
import net.elec_tronics.item.DiamondDustItem;
import net.elec_tronics.item.CreativefluiddropperItem;
import net.elec_tronics.item.CopperwireItem;
import net.elec_tronics.item.CopperSheetItem;
import net.elec_tronics.item.CopperDustItem;
import net.elec_tronics.item.CoolingTowerItem;
import net.elec_tronics.item.CondensorItem;
import net.elec_tronics.item.BrineItem;
import net.elec_tronics.item.BauxiteIngotItem;
import net.elec_tronics.item.AshItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item URANIUM_INGOT = register(new UraniumIngotItem());
	public static final Item URANIUMORE = register(ElecTronicsModBlocks.URANIUMORE, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item URANIUM_DUST = register(new UraniumDustItem());
	public static final Item TUNGSTEN = register(ElecTronicsModBlocks.TUNGSTEN, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item TUNGSTEN_ORE = register(new TungstenOreItem());
	public static final Item TUNGSTEN_INGOT = register(new TungstenIngotItem());
	public static final Item REINFORCEDBLASTBRICK = register(ElecTronicsModBlocks.REINFORCEDBLASTBRICK, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item INSULATION = register(new InsulationItem());
	public static final Item BLASTFURNANCEMACHINE = register(ElecTronicsModBlocks.BLASTFURNANCEMACHINE, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item FIBGER_GLASS_DUST = register(new FibgerGlassDustItem());
	public static final Item STEELINGOT = register(new SteelingotItem());
	public static final Item ENGINEERSWORKBENCH = register(ElecTronicsModBlocks.ENGINEERSWORKBENCH, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item STEELPICKAXE = register(new SteelpickaxeItem());
	public static final Item STEELSWORD = register(new SteelswordItem());
	public static final Item STEELSHOVEL = register(new SteelshovelItem());
	public static final Item STEELAXE = register(new SteelaxeItem());
	public static final Item STEELHOE = register(new SteelhoeItem());
	public static final Item HAND_SAW = register(new HandSawItem());
	public static final Item SCREWDRIVER = register(new ScrewdriverItem());
	public static final Item HAMMER = register(new HammerItem());
	public static final Item SHARPENEDIRON = register(new SharpenedironItem());
	public static final Item WATERTURBINEMACHINE = register(ElecTronicsModBlocks.WATERTURBINEMACHINE, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item COALGENERATORMACHINE = register(ElecTronicsModBlocks.COALGENERATORMACHINE, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item ASH = register(new AshItem());
	public static final Item CRUSHERMACHINE = register(ElecTronicsModBlocks.CRUSHERMACHINE, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item IRONDUST = register(new IrondustItem());
	public static final Item T_1_WIRE = register(ElecTronicsModBlocks.T_1_WIRE, null);
	public static final Item CABLE_TT_1 = register(ElecTronicsModBlocks.CABLE_TT_1, null);
	public static final Item CABLE_JUNCTION_T_1 = register(ElecTronicsModBlocks.CABLE_JUNCTION_T_1, null);
	public static final Item CABLE_ANGLE_T_1 = register(ElecTronicsModBlocks.CABLE_ANGLE_T_1, null);
	public static final Item ENGINEERS_WORK_BENCH_SIDE = register(ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE, null);
	public static final Item ENGINEERS_WORK_BENCH_TOP = register(ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP, null);
	public static final Item ENGINEERS_WORK_BENCH_TOP_SIDE = register(ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE, null);
	public static final Item CABLE_T_UP_T_1 = register(ElecTronicsModBlocks.CABLE_T_UP_T_1, null);
	public static final Item CABLE_T_DOWN_T_1 = register(ElecTronicsModBlocks.CABLE_T_DOWN_T_1, null);
	public static final Item CABLE_T_UPAND_DOWN_T_1 = register(ElecTronicsModBlocks.CABLE_T_UPAND_DOWN_T_1, null);
	public static final Item CABLE_JUNCTION_UP_T_1 = register(ElecTronicsModBlocks.CABLE_JUNCTION_UP_T_1, null);
	public static final Item CABLE_JUNCTION_DOWN_T_1 = register(ElecTronicsModBlocks.CABLE_JUNCTION_DOWN_T_1, null);
	public static final Item CABLE_JUNCTION_UPAND_DOWN_T_1 = register(ElecTronicsModBlocks.CABLE_JUNCTION_UPAND_DOWN_T_1, null);
	public static final Item BASECABLE_T_1 = register(ElecTronicsModBlocks.BASECABLE_T_1, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item CABLEHALF_T_1 = register(ElecTronicsModBlocks.CABLEHALF_T_1, null);
	public static final Item BASEWIRECON_2ANGLE = register(ElecTronicsModBlocks.BASEWIRECON_2ANGLE, null);
	public static final Item BASEWIRECON_2ANGLEDOWN = register(ElecTronicsModBlocks.BASEWIRECON_2ANGLEDOWN, null);
	public static final Item BASEWIRECON_2ANGLEUP = register(ElecTronicsModBlocks.BASEWIRECON_2ANGLEUP, null);
	public static final Item BASEWIRECON_3 = register(ElecTronicsModBlocks.BASEWIRECON_3, null);
	public static final Item BASEWIRECON_3DOWN = register(ElecTronicsModBlocks.BASEWIRECON_3DOWN, null);
	public static final Item BASEWIRECON_3DOWNANDUP = register(ElecTronicsModBlocks.BASEWIRECON_3DOWNANDUP, null);
	public static final Item BASEWIRECON_3DOWNANGLE = register(ElecTronicsModBlocks.BASEWIRECON_3DOWNANGLE, null);
	public static final Item BASEWIRECON_3UP = register(ElecTronicsModBlocks.BASEWIRECON_3UP, null);
	public static final Item BASEWIRECON_3UPANGLE = register(ElecTronicsModBlocks.BASEWIRECON_3UPANGLE, null);
	public static final Item BASEWIRECON_4DOWN = register(ElecTronicsModBlocks.BASEWIRECON_4DOWN, null);
	public static final Item BASEWIRECON_4UP = register(ElecTronicsModBlocks.BASEWIRECON_4UP, null);
	public static final Item BASEWIRECON_4UPANDDOWN = register(ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWN, null);
	public static final Item BASEWIRECON_4UPANDDOWNSTRAIGHT = register(ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWNSTRAIGHT, null);
	public static final Item BASEWIRECON_5DOWN = register(ElecTronicsModBlocks.BASEWIRECON_5DOWN, null);
	public static final Item BASEWIRECON_5MAIN = register(ElecTronicsModBlocks.BASEWIRECON_5MAIN, null);
	public static final Item SOLAR_PANEL_T_1 = register(ElecTronicsModBlocks.SOLAR_PANEL_T_1, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item SOLAR_PANELR = register(ElecTronicsModBlocks.SOLAR_PANELR, null);
	public static final Item SOLARPANELTOP = register(ElecTronicsModBlocks.SOLARPANELTOP, null);
	public static final Item SOLARPANELTOPR = register(ElecTronicsModBlocks.SOLARPANELTOPR, null);
	public static final Item TUNGSTEN_DUST = register(new TungstenDustItem());
	public static final Item DIAMOND_DUST = register(new DiamondDustItem());
	public static final Item GOLD_DUST = register(new GoldDustItem());
	public static final Item EMERALD_DUST = register(new EmeraldDustItem());
	public static final Item COPPER_DUST = register(new CopperDustItem());
	public static final Item QUARTZ_DUST = register(new QuartzDustItem());
	public static final Item RUBBER = register(new RubberItem());
	public static final Item COPPERWIRE = register(new CopperwireItem());
	public static final Item EXTRUSION_MACHINE = register(ElecTronicsModBlocks.EXTRUSION_MACHINE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item RUBBERSLEEVE = register(new RubbersleeveItem());
	public static final Item TURBINE = register(new TurbineItem());
	public static final Item CONDENSOR = register(new CondensorItem());
	public static final Item COOLING_TOWER = register(new CoolingTowerItem());
	public static final Item GENERATOR = register(new GeneratorItem());
	public static final Item SOLAR_PANEL = register(new SolarPanelItem());
	public static final Item ENERGY_STORAGE_T_1 = register(ElecTronicsModBlocks.ENERGY_STORAGE_T_1, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item ELECTRICMOTOR = register(new ElectricmotorItem());
	public static final Item ORE_FUNNEL = register(new OreFunnelItem());
	public static final Item GRINDER = register(new GrinderItem());
	public static final Item IRONGEAR = register(new IrongearItem());
	public static final Item COPPER_SHEET = register(new CopperSheetItem());
	public static final Item WIRE_ROLLER = register(new WireRollerItem());
	public static final Item BASEPIPE = register(ElecTronicsModBlocks.BASEPIPE, ElecTronicsModTabs.TAB_ELEC_TRONICS_MENU);
	public static final Item PIPEANGLE = register(ElecTronicsModBlocks.PIPEANGLE, null);
	public static final Item PIPEANGLEDOWN = register(ElecTronicsModBlocks.PIPEANGLEDOWN, null);
	public static final Item PIPEANLGEUP = register(ElecTronicsModBlocks.PIPEANLGEUP, null);
	public static final Item PIPEDOWNANGLE = register(ElecTronicsModBlocks.PIPEDOWNANGLE, null);
	public static final Item PIPEHALF = register(ElecTronicsModBlocks.PIPEHALF, null);
	public static final Item PIPEJUNCTION = register(ElecTronicsModBlocks.PIPEJUNCTION, null);
	public static final Item PIPEJUNCTIONDOWN = register(ElecTronicsModBlocks.PIPEJUNCTIONDOWN, null);
	public static final Item PIPEJUNCTIONDOWN_2 = register(ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2, null);
	public static final Item PIPEJUNCTIONMAIN = register(ElecTronicsModBlocks.PIPEJUNCTIONMAIN, null);
	public static final Item PIPEJUNCTIONUP = register(ElecTronicsModBlocks.PIPEJUNCTIONUP, null);
	public static final Item PIPEJUNCTIONUP_2 = register(ElecTronicsModBlocks.PIPEJUNCTIONUP_2, null);
	public static final Item PIPEJUNCTIONUPANDDOWN = register(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN, null);
	public static final Item PIPEJUNCTIONUPANDDOWN_2 = register(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2, null);
	public static final Item PIPEJUNCTIONUPANDDOWNSTRAIGHT = register(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT, null);
	public static final Item PIPESTRAIGHT = register(ElecTronicsModBlocks.PIPESTRAIGHT, null);
	public static final Item PIPET = register(ElecTronicsModBlocks.PIPET, null);
	public static final Item PIPETDOWN = register(ElecTronicsModBlocks.PIPETDOWN, null);
	public static final Item PIPETDOWNANDUP = register(ElecTronicsModBlocks.PIPETDOWNANDUP, null);
	public static final Item PIPEUP = register(ElecTronicsModBlocks.PIPEUP, null);
	public static final Item PIPEUPANGLE = register(ElecTronicsModBlocks.PIPEUPANGLE, null);
	public static final Item TANK = register(ElecTronicsModBlocks.TANK, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item TANKFULL_1 = register(ElecTronicsModBlocks.TANKFULL_1, null);
	public static final Item TANKFULL_2 = register(ElecTronicsModBlocks.TANKFULL_2, null);
	public static final Item TANKFULL_3 = register(ElecTronicsModBlocks.TANKFULL_3, null);
	public static final Item TANKFULL_4 = register(ElecTronicsModBlocks.TANKFULL_4, null);
	public static final Item TANKFULL_5 = register(ElecTronicsModBlocks.TANKFULL_5, null);
	public static final Item TANKFULL_6 = register(ElecTronicsModBlocks.TANKFULL_6, null);
	public static final Item TANKFULL_7 = register(ElecTronicsModBlocks.TANKFULL_7, null);
	public static final Item TANKFULL_8 = register(ElecTronicsModBlocks.TANKFULL_8, null);
	public static final Item TANKFULL_9 = register(ElecTronicsModBlocks.TANKFULL_9, null);
	public static final Item TANKFULL_10 = register(ElecTronicsModBlocks.TANKFULL_10, null);
	public static final Item TANKFULL_11 = register(ElecTronicsModBlocks.TANKFULL_11, null);
	public static final Item TANKFULL_12 = register(ElecTronicsModBlocks.TANKFULL_12, null);
	public static final Item TANKFULL_13 = register(ElecTronicsModBlocks.TANKFULL_13, null);
	public static final Item TANKFULL_14 = register(ElecTronicsModBlocks.TANKFULL_14, null);
	public static final Item ELECTRONICSOIL_BUCKET = register(new ElectronicsoilItem());
	public static final Item CREATIVEFLUIDDROPPER = register(new CreativefluiddropperItem());
	public static final Item MANUAL_FLUID_PUMP = register(ElecTronicsModBlocks.MANUAL_FLUID_PUMP, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item MANUAL_FLUID_PUMPDOWN_2 = register(ElecTronicsModBlocks.MANUAL_FLUID_PUMPDOWN_2, null);
	public static final Item MANUAL_FLUID_PUMP_3 = register(ElecTronicsModBlocks.MANUAL_FLUID_PUMP_3, null);
	public static final Item MANUAL_FLUID_PUMP_4 = register(ElecTronicsModBlocks.MANUAL_FLUID_PUMP_4, null);
	public static final Item MANUAL_FLUID_PUMP_5 = register(ElecTronicsModBlocks.MANUAL_FLUID_PUMP_5, null);
	public static final Item TANKFULLHALF_1 = register(ElecTronicsModBlocks.TANKFULLHALF_1, null);
	public static final Item BAUXITE_INGOT = register(new BauxiteIngotItem());
	public static final Item BAUXITE_ORE = register(ElecTronicsModBlocks.BAUXITE_ORE, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item BAUXITE_BLOCK = register(ElecTronicsModBlocks.BAUXITE_BLOCK, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item STEEL_ARMOR_HELMET = register(new SteelArmorItem.Helmet());
	public static final Item STEEL_ARMOR_CHESTPLATE = register(new SteelArmorItem.Chestplate());
	public static final Item STEEL_ARMOR_LEGGINGS = register(new SteelArmorItem.Leggings());
	public static final Item STEEL_ARMOR_BOOTS = register(new SteelArmorItem.Boots());
	public static final Item BRINE_BUCKET = register(new BrineItem());
	public static final Item ROCK_SALT = register(ElecTronicsModBlocks.ROCK_SALT, ElecTronicsModTabs.TAB_ELECTRONICSMACHINES);
	public static final Item ROCKSALTDUST = register(new RocksaltdustItem());
	public static final Item IRON_WRENCH = register(new IronWrenchItem());

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

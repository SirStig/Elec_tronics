
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.elec_tronics.block.WaterturbinemachineBlock;
import net.elec_tronics.block.UraniumoreBlock;
import net.elec_tronics.block.TungstenBlock;
import net.elec_tronics.block.T1WireBlock;
import net.elec_tronics.block.SolarpaneltoprBlock;
import net.elec_tronics.block.SolarpaneltopBlock;
import net.elec_tronics.block.SolarPanelrBlock;
import net.elec_tronics.block.SolarPanelT1Block;
import net.elec_tronics.block.ReinforcedblastbrickBlock;
import net.elec_tronics.block.EngineersworkbenchBlock;
import net.elec_tronics.block.EngineersWorkBenchTopSideBlock;
import net.elec_tronics.block.EngineersWorkBenchTopBlock;
import net.elec_tronics.block.EngineersWorkBenchSideBlock;
import net.elec_tronics.block.CrushermachineBlock;
import net.elec_tronics.block.CoalgeneratormachineBlock;
import net.elec_tronics.block.CablehalfT1Block;
import net.elec_tronics.block.CableTUpandDownT1Block;
import net.elec_tronics.block.CableTUpT1Block;
import net.elec_tronics.block.CableTT1Block;
import net.elec_tronics.block.CableTDownT1Block;
import net.elec_tronics.block.CableJunctionUpandDownT1Block;
import net.elec_tronics.block.CableJunctionUpT1Block;
import net.elec_tronics.block.CableJunctionT1Block;
import net.elec_tronics.block.CableJunctionDownT1Block;
import net.elec_tronics.block.CableAngleT1Block;
import net.elec_tronics.block.BlastfurnancemachineBlock;
import net.elec_tronics.block.Basewirecon5mainBlock;
import net.elec_tronics.block.Basewirecon5downBlock;
import net.elec_tronics.block.Basewirecon4upanddownstraightBlock;
import net.elec_tronics.block.Basewirecon4upanddownBlock;
import net.elec_tronics.block.Basewirecon4upBlock;
import net.elec_tronics.block.Basewirecon4downBlock;
import net.elec_tronics.block.Basewirecon3upangleBlock;
import net.elec_tronics.block.Basewirecon3upBlock;
import net.elec_tronics.block.Basewirecon3downangleBlock;
import net.elec_tronics.block.Basewirecon3downandupBlock;
import net.elec_tronics.block.Basewirecon3downBlock;
import net.elec_tronics.block.Basewirecon3Block;
import net.elec_tronics.block.Basewirecon2angleupBlock;
import net.elec_tronics.block.Basewirecon2angledownBlock;
import net.elec_tronics.block.Basewirecon2angleBlock;
import net.elec_tronics.block.BasecableT1Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block URANIUMORE = register(new UraniumoreBlock());
	public static final Block TUNGSTEN = register(new TungstenBlock());
	public static final Block REINFORCEDBLASTBRICK = register(new ReinforcedblastbrickBlock());
	public static final Block BLASTFURNANCEMACHINE = register(new BlastfurnancemachineBlock());
	public static final Block ENGINEERSWORKBENCH = register(new EngineersworkbenchBlock());
	public static final Block WATERTURBINEMACHINE = register(new WaterturbinemachineBlock());
	public static final Block COALGENERATORMACHINE = register(new CoalgeneratormachineBlock());
	public static final Block CRUSHERMACHINE = register(new CrushermachineBlock());
	public static final Block T_1_WIRE = register(new T1WireBlock());
	public static final Block CABLE_TT_1 = register(new CableTT1Block());
	public static final Block CABLE_JUNCTION_T_1 = register(new CableJunctionT1Block());
	public static final Block CABLE_ANGLE_T_1 = register(new CableAngleT1Block());
	public static final Block ENGINEERS_WORK_BENCH_SIDE = register(new EngineersWorkBenchSideBlock());
	public static final Block ENGINEERS_WORK_BENCH_TOP = register(new EngineersWorkBenchTopBlock());
	public static final Block ENGINEERS_WORK_BENCH_TOP_SIDE = register(new EngineersWorkBenchTopSideBlock());
	public static final Block CABLE_T_UP_T_1 = register(new CableTUpT1Block());
	public static final Block CABLE_T_DOWN_T_1 = register(new CableTDownT1Block());
	public static final Block CABLE_T_UPAND_DOWN_T_1 = register(new CableTUpandDownT1Block());
	public static final Block CABLE_JUNCTION_UP_T_1 = register(new CableJunctionUpT1Block());
	public static final Block CABLE_JUNCTION_DOWN_T_1 = register(new CableJunctionDownT1Block());
	public static final Block CABLE_JUNCTION_UPAND_DOWN_T_1 = register(new CableJunctionUpandDownT1Block());
	public static final Block BASECABLE_T_1 = register(new BasecableT1Block());
	public static final Block CABLEHALF_T_1 = register(new CablehalfT1Block());
	public static final Block BASEWIRECON_2ANGLE = register(new Basewirecon2angleBlock());
	public static final Block BASEWIRECON_2ANGLEDOWN = register(new Basewirecon2angledownBlock());
	public static final Block BASEWIRECON_2ANGLEUP = register(new Basewirecon2angleupBlock());
	public static final Block BASEWIRECON_3 = register(new Basewirecon3Block());
	public static final Block BASEWIRECON_3DOWN = register(new Basewirecon3downBlock());
	public static final Block BASEWIRECON_3DOWNANDUP = register(new Basewirecon3downandupBlock());
	public static final Block BASEWIRECON_3DOWNANGLE = register(new Basewirecon3downangleBlock());
	public static final Block BASEWIRECON_3UP = register(new Basewirecon3upBlock());
	public static final Block BASEWIRECON_3UPANGLE = register(new Basewirecon3upangleBlock());
	public static final Block BASEWIRECON_4DOWN = register(new Basewirecon4downBlock());
	public static final Block BASEWIRECON_4UP = register(new Basewirecon4upBlock());
	public static final Block BASEWIRECON_4UPANDDOWN = register(new Basewirecon4upanddownBlock());
	public static final Block BASEWIRECON_4UPANDDOWNSTRAIGHT = register(new Basewirecon4upanddownstraightBlock());
	public static final Block BASEWIRECON_5DOWN = register(new Basewirecon5downBlock());
	public static final Block BASEWIRECON_5MAIN = register(new Basewirecon5mainBlock());
	public static final Block SOLAR_PANEL_T_1 = register(new SolarPanelT1Block());
	public static final Block SOLAR_PANELR = register(new SolarPanelrBlock());
	public static final Block SOLARPANELTOP = register(new SolarpaneltopBlock());
	public static final Block SOLARPANELTOPR = register(new SolarpaneltoprBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			EngineersworkbenchBlock.registerRenderLayer();
			T1WireBlock.registerRenderLayer();
			CableTT1Block.registerRenderLayer();
			CableJunctionT1Block.registerRenderLayer();
			CableAngleT1Block.registerRenderLayer();
			EngineersWorkBenchSideBlock.registerRenderLayer();
			EngineersWorkBenchTopBlock.registerRenderLayer();
			EngineersWorkBenchTopSideBlock.registerRenderLayer();
			CableTUpT1Block.registerRenderLayer();
			CableTDownT1Block.registerRenderLayer();
			CableTUpandDownT1Block.registerRenderLayer();
			CableJunctionUpT1Block.registerRenderLayer();
			CableJunctionDownT1Block.registerRenderLayer();
			CableJunctionUpandDownT1Block.registerRenderLayer();
			BasecableT1Block.registerRenderLayer();
			CablehalfT1Block.registerRenderLayer();
			Basewirecon2angleBlock.registerRenderLayer();
			Basewirecon2angledownBlock.registerRenderLayer();
			Basewirecon2angleupBlock.registerRenderLayer();
			Basewirecon3Block.registerRenderLayer();
			Basewirecon3downBlock.registerRenderLayer();
			Basewirecon3downandupBlock.registerRenderLayer();
			Basewirecon3downangleBlock.registerRenderLayer();
			Basewirecon3upBlock.registerRenderLayer();
			Basewirecon3upangleBlock.registerRenderLayer();
			Basewirecon4downBlock.registerRenderLayer();
			Basewirecon4upBlock.registerRenderLayer();
			Basewirecon4upanddownBlock.registerRenderLayer();
			Basewirecon4upanddownstraightBlock.registerRenderLayer();
			Basewirecon5downBlock.registerRenderLayer();
			Basewirecon5mainBlock.registerRenderLayer();
			SolarPanelT1Block.registerRenderLayer();
			SolarPanelrBlock.registerRenderLayer();
			SolarpaneltopBlock.registerRenderLayer();
			SolarpaneltoprBlock.registerRenderLayer();
		}
	}
}

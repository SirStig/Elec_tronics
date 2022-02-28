
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
import net.elec_tronics.block.ReinforcedblastbrickBlock;
import net.elec_tronics.block.EngineersworkbenchBlock;
import net.elec_tronics.block.EngineersWorkBenchTopSideBlock;
import net.elec_tronics.block.EngineersWorkBenchTopBlock;
import net.elec_tronics.block.EngineersWorkBenchSideBlock;
import net.elec_tronics.block.CrushermachineBlock;
import net.elec_tronics.block.CoalgeneratormachineBlock;
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
		}
	}
}

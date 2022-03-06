
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.elec_tronics.block.entity.T1WireBlockEntity;
import net.elec_tronics.block.entity.SolarpaneltoprBlockEntity;
import net.elec_tronics.block.entity.SolarpaneltopBlockEntity;
import net.elec_tronics.block.entity.SolarPanelrBlockEntity;
import net.elec_tronics.block.entity.SolarPanelT1BlockEntity;
import net.elec_tronics.block.entity.PipeupangleBlockEntity;
import net.elec_tronics.block.entity.PipeupBlockEntity;
import net.elec_tronics.block.entity.PipetdownandupBlockEntity;
import net.elec_tronics.block.entity.PipetdownBlockEntity;
import net.elec_tronics.block.entity.PipetBlockEntity;
import net.elec_tronics.block.entity.PipestraightBlockEntity;
import net.elec_tronics.block.entity.PipejunctionupanddownstraightBlockEntity;
import net.elec_tronics.block.entity.PipejunctionupanddownBlockEntity;
import net.elec_tronics.block.entity.Pipejunctionupanddown2BlockEntity;
import net.elec_tronics.block.entity.PipejunctionupBlockEntity;
import net.elec_tronics.block.entity.Pipejunctionup2BlockEntity;
import net.elec_tronics.block.entity.PipejunctionmainBlockEntity;
import net.elec_tronics.block.entity.PipejunctiondownBlockEntity;
import net.elec_tronics.block.entity.Pipejunctiondown2BlockEntity;
import net.elec_tronics.block.entity.PipejunctionBlockEntity;
import net.elec_tronics.block.entity.PipehalfBlockEntity;
import net.elec_tronics.block.entity.PipedownangleBlockEntity;
import net.elec_tronics.block.entity.PipeanlgeupBlockEntity;
import net.elec_tronics.block.entity.PipeangledownBlockEntity;
import net.elec_tronics.block.entity.PipeangleBlockEntity;
import net.elec_tronics.block.entity.ExtrusionMachineBlockEntity;
import net.elec_tronics.block.entity.EngineersworkbenchBlockEntity;
import net.elec_tronics.block.entity.EngineersWorkBenchTopSideBlockEntity;
import net.elec_tronics.block.entity.EngineersWorkBenchTopBlockEntity;
import net.elec_tronics.block.entity.EngineersWorkBenchSideBlockEntity;
import net.elec_tronics.block.entity.EnergyStorageT1BlockEntity;
import net.elec_tronics.block.entity.CrushermachineBlockEntity;
import net.elec_tronics.block.entity.CoalgeneratormachineBlockEntity;
import net.elec_tronics.block.entity.CablehalfT1BlockEntity;
import net.elec_tronics.block.entity.CableTUpandDownT1BlockEntity;
import net.elec_tronics.block.entity.CableTUpT1BlockEntity;
import net.elec_tronics.block.entity.CableTT1BlockEntity;
import net.elec_tronics.block.entity.CableTDownT1BlockEntity;
import net.elec_tronics.block.entity.CableJunctionUpandDownT1BlockEntity;
import net.elec_tronics.block.entity.CableJunctionUpT1BlockEntity;
import net.elec_tronics.block.entity.CableJunctionT1BlockEntity;
import net.elec_tronics.block.entity.CableJunctionDownT1BlockEntity;
import net.elec_tronics.block.entity.CableAngleT1BlockEntity;
import net.elec_tronics.block.entity.BlastfurnancemachineBlockEntity;
import net.elec_tronics.block.entity.Basewirecon5mainBlockEntity;
import net.elec_tronics.block.entity.Basewirecon5downBlockEntity;
import net.elec_tronics.block.entity.Basewirecon4upanddownstraightBlockEntity;
import net.elec_tronics.block.entity.Basewirecon4upanddownBlockEntity;
import net.elec_tronics.block.entity.Basewirecon4upBlockEntity;
import net.elec_tronics.block.entity.Basewirecon4downBlockEntity;
import net.elec_tronics.block.entity.Basewirecon3upangleBlockEntity;
import net.elec_tronics.block.entity.Basewirecon3upBlockEntity;
import net.elec_tronics.block.entity.Basewirecon3downangleBlockEntity;
import net.elec_tronics.block.entity.Basewirecon3downandupBlockEntity;
import net.elec_tronics.block.entity.Basewirecon3downBlockEntity;
import net.elec_tronics.block.entity.Basewirecon3BlockEntity;
import net.elec_tronics.block.entity.Basewirecon2angleupBlockEntity;
import net.elec_tronics.block.entity.Basewirecon2angledownBlockEntity;
import net.elec_tronics.block.entity.Basewirecon2angleBlockEntity;
import net.elec_tronics.block.entity.BasepipeBlockEntity;
import net.elec_tronics.block.entity.BasecableT1BlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> BLASTFURNANCEMACHINE = register("elec_tronics:blastfurnancemachine",
			ElecTronicsModBlocks.BLASTFURNANCEMACHINE, BlastfurnancemachineBlockEntity::new);
	public static final BlockEntityType<?> ENGINEERSWORKBENCH = register("elec_tronics:engineersworkbench", ElecTronicsModBlocks.ENGINEERSWORKBENCH,
			EngineersworkbenchBlockEntity::new);
	public static final BlockEntityType<?> COALGENERATORMACHINE = register("elec_tronics:coalgeneratormachine",
			ElecTronicsModBlocks.COALGENERATORMACHINE, CoalgeneratormachineBlockEntity::new);
	public static final BlockEntityType<?> CRUSHERMACHINE = register("elec_tronics:crushermachine", ElecTronicsModBlocks.CRUSHERMACHINE,
			CrushermachineBlockEntity::new);
	public static final BlockEntityType<?> T_1_WIRE = register("elec_tronics:t_1_wire", ElecTronicsModBlocks.T_1_WIRE, T1WireBlockEntity::new);
	public static final BlockEntityType<?> CABLE_TT_1 = register("elec_tronics:cable_tt_1", ElecTronicsModBlocks.CABLE_TT_1,
			CableTT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_JUNCTION_T_1 = register("elec_tronics:cable_junction_t_1", ElecTronicsModBlocks.CABLE_JUNCTION_T_1,
			CableJunctionT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_ANGLE_T_1 = register("elec_tronics:cable_angle_t_1", ElecTronicsModBlocks.CABLE_ANGLE_T_1,
			CableAngleT1BlockEntity::new);
	public static final BlockEntityType<?> ENGINEERS_WORK_BENCH_SIDE = register("elec_tronics:engineers_work_bench_side",
			ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE, EngineersWorkBenchSideBlockEntity::new);
	public static final BlockEntityType<?> ENGINEERS_WORK_BENCH_TOP = register("elec_tronics:engineers_work_bench_top",
			ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP, EngineersWorkBenchTopBlockEntity::new);
	public static final BlockEntityType<?> ENGINEERS_WORK_BENCH_TOP_SIDE = register("elec_tronics:engineers_work_bench_top_side",
			ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE, EngineersWorkBenchTopSideBlockEntity::new);
	public static final BlockEntityType<?> CABLE_T_UP_T_1 = register("elec_tronics:cable_t_up_t_1", ElecTronicsModBlocks.CABLE_T_UP_T_1,
			CableTUpT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_T_DOWN_T_1 = register("elec_tronics:cable_t_down_t_1", ElecTronicsModBlocks.CABLE_T_DOWN_T_1,
			CableTDownT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_T_UPAND_DOWN_T_1 = register("elec_tronics:cable_t_upand_down_t_1",
			ElecTronicsModBlocks.CABLE_T_UPAND_DOWN_T_1, CableTUpandDownT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_JUNCTION_UP_T_1 = register("elec_tronics:cable_junction_up_t_1",
			ElecTronicsModBlocks.CABLE_JUNCTION_UP_T_1, CableJunctionUpT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_JUNCTION_DOWN_T_1 = register("elec_tronics:cable_junction_down_t_1",
			ElecTronicsModBlocks.CABLE_JUNCTION_DOWN_T_1, CableJunctionDownT1BlockEntity::new);
	public static final BlockEntityType<?> CABLE_JUNCTION_UPAND_DOWN_T_1 = register("elec_tronics:cable_junction_upand_down_t_1",
			ElecTronicsModBlocks.CABLE_JUNCTION_UPAND_DOWN_T_1, CableJunctionUpandDownT1BlockEntity::new);
	public static final BlockEntityType<?> BASECABLE_T_1 = register("elec_tronics:basecable_t_1", ElecTronicsModBlocks.BASECABLE_T_1,
			BasecableT1BlockEntity::new);
	public static final BlockEntityType<?> CABLEHALF_T_1 = register("elec_tronics:cablehalf_t_1", ElecTronicsModBlocks.CABLEHALF_T_1,
			CablehalfT1BlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_2ANGLE = register("elec_tronics:basewirecon_2angle", ElecTronicsModBlocks.BASEWIRECON_2ANGLE,
			Basewirecon2angleBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_2ANGLEDOWN = register("elec_tronics:basewirecon_2angledown",
			ElecTronicsModBlocks.BASEWIRECON_2ANGLEDOWN, Basewirecon2angledownBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_2ANGLEUP = register("elec_tronics:basewirecon_2angleup",
			ElecTronicsModBlocks.BASEWIRECON_2ANGLEUP, Basewirecon2angleupBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_3 = register("elec_tronics:basewirecon_3", ElecTronicsModBlocks.BASEWIRECON_3,
			Basewirecon3BlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_3DOWN = register("elec_tronics:basewirecon_3down", ElecTronicsModBlocks.BASEWIRECON_3DOWN,
			Basewirecon3downBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_3DOWNANDUP = register("elec_tronics:basewirecon_3downandup",
			ElecTronicsModBlocks.BASEWIRECON_3DOWNANDUP, Basewirecon3downandupBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_3DOWNANGLE = register("elec_tronics:basewirecon_3downangle",
			ElecTronicsModBlocks.BASEWIRECON_3DOWNANGLE, Basewirecon3downangleBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_3UP = register("elec_tronics:basewirecon_3up", ElecTronicsModBlocks.BASEWIRECON_3UP,
			Basewirecon3upBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_3UPANGLE = register("elec_tronics:basewirecon_3upangle",
			ElecTronicsModBlocks.BASEWIRECON_3UPANGLE, Basewirecon3upangleBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_4DOWN = register("elec_tronics:basewirecon_4down", ElecTronicsModBlocks.BASEWIRECON_4DOWN,
			Basewirecon4downBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_4UP = register("elec_tronics:basewirecon_4up", ElecTronicsModBlocks.BASEWIRECON_4UP,
			Basewirecon4upBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_4UPANDDOWN = register("elec_tronics:basewirecon_4upanddown",
			ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWN, Basewirecon4upanddownBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_4UPANDDOWNSTRAIGHT = register("elec_tronics:basewirecon_4upanddownstraight",
			ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWNSTRAIGHT, Basewirecon4upanddownstraightBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_5DOWN = register("elec_tronics:basewirecon_5down", ElecTronicsModBlocks.BASEWIRECON_5DOWN,
			Basewirecon5downBlockEntity::new);
	public static final BlockEntityType<?> BASEWIRECON_5MAIN = register("elec_tronics:basewirecon_5main", ElecTronicsModBlocks.BASEWIRECON_5MAIN,
			Basewirecon5mainBlockEntity::new);
	public static final BlockEntityType<?> SOLAR_PANEL_T_1 = register("elec_tronics:solar_panel_t_1", ElecTronicsModBlocks.SOLAR_PANEL_T_1,
			SolarPanelT1BlockEntity::new);
	public static final BlockEntityType<?> SOLAR_PANELR = register("elec_tronics:solar_panelr", ElecTronicsModBlocks.SOLAR_PANELR,
			SolarPanelrBlockEntity::new);
	public static final BlockEntityType<?> SOLARPANELTOP = register("elec_tronics:solarpaneltop", ElecTronicsModBlocks.SOLARPANELTOP,
			SolarpaneltopBlockEntity::new);
	public static final BlockEntityType<?> SOLARPANELTOPR = register("elec_tronics:solarpaneltopr", ElecTronicsModBlocks.SOLARPANELTOPR,
			SolarpaneltoprBlockEntity::new);
	public static final BlockEntityType<?> EXTRUSION_MACHINE = register("elec_tronics:extrusion_machine", ElecTronicsModBlocks.EXTRUSION_MACHINE,
			ExtrusionMachineBlockEntity::new);
	public static final BlockEntityType<?> ENERGY_STORAGE_T_1 = register("elec_tronics:energy_storage_t_1", ElecTronicsModBlocks.ENERGY_STORAGE_T_1,
			EnergyStorageT1BlockEntity::new);
	public static final BlockEntityType<?> BASEPIPE = register("elec_tronics:basepipe", ElecTronicsModBlocks.BASEPIPE, BasepipeBlockEntity::new);
	public static final BlockEntityType<?> PIPEANGLE = register("elec_tronics:pipeangle", ElecTronicsModBlocks.PIPEANGLE, PipeangleBlockEntity::new);
	public static final BlockEntityType<?> PIPEANGLEDOWN = register("elec_tronics:pipeangledown", ElecTronicsModBlocks.PIPEANGLEDOWN,
			PipeangledownBlockEntity::new);
	public static final BlockEntityType<?> PIPEANLGEUP = register("elec_tronics:pipeanlgeup", ElecTronicsModBlocks.PIPEANLGEUP,
			PipeanlgeupBlockEntity::new);
	public static final BlockEntityType<?> PIPEDOWNANGLE = register("elec_tronics:pipedownangle", ElecTronicsModBlocks.PIPEDOWNANGLE,
			PipedownangleBlockEntity::new);
	public static final BlockEntityType<?> PIPEHALF = register("elec_tronics:pipehalf", ElecTronicsModBlocks.PIPEHALF, PipehalfBlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTION = register("elec_tronics:pipejunction", ElecTronicsModBlocks.PIPEJUNCTION,
			PipejunctionBlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONDOWN = register("elec_tronics:pipejunctiondown", ElecTronicsModBlocks.PIPEJUNCTIONDOWN,
			PipejunctiondownBlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONDOWN_2 = register("elec_tronics:pipejunctiondown_2", ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2,
			Pipejunctiondown2BlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONMAIN = register("elec_tronics:pipejunctionmain", ElecTronicsModBlocks.PIPEJUNCTIONMAIN,
			PipejunctionmainBlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONUP = register("elec_tronics:pipejunctionup", ElecTronicsModBlocks.PIPEJUNCTIONUP,
			PipejunctionupBlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONUP_2 = register("elec_tronics:pipejunctionup_2", ElecTronicsModBlocks.PIPEJUNCTIONUP_2,
			Pipejunctionup2BlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONUPANDDOWN = register("elec_tronics:pipejunctionupanddown",
			ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN, PipejunctionupanddownBlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONUPANDDOWN_2 = register("elec_tronics:pipejunctionupanddown_2",
			ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2, Pipejunctionupanddown2BlockEntity::new);
	public static final BlockEntityType<?> PIPEJUNCTIONUPANDDOWNSTRAIGHT = register("elec_tronics:pipejunctionupanddownstraight",
			ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT, PipejunctionupanddownstraightBlockEntity::new);
	public static final BlockEntityType<?> PIPESTRAIGHT = register("elec_tronics:pipestraight", ElecTronicsModBlocks.PIPESTRAIGHT,
			PipestraightBlockEntity::new);
	public static final BlockEntityType<?> PIPET = register("elec_tronics:pipet", ElecTronicsModBlocks.PIPET, PipetBlockEntity::new);
	public static final BlockEntityType<?> PIPETDOWN = register("elec_tronics:pipetdown", ElecTronicsModBlocks.PIPETDOWN, PipetdownBlockEntity::new);
	public static final BlockEntityType<?> PIPETDOWNANDUP = register("elec_tronics:pipetdownandup", ElecTronicsModBlocks.PIPETDOWNANDUP,
			PipetdownandupBlockEntity::new);
	public static final BlockEntityType<?> PIPEUP = register("elec_tronics:pipeup", ElecTronicsModBlocks.PIPEUP, PipeupBlockEntity::new);
	public static final BlockEntityType<?> PIPEUPANGLE = register("elec_tronics:pipeupangle", ElecTronicsModBlocks.PIPEUPANGLE,
			PipeupangleBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}

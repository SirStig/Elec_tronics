
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elec_tronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.elec_tronics.block.entity.Tankfullhalf1BlockEntity;
import net.elec_tronics.block.entity.Tankfull9BlockEntity;
import net.elec_tronics.block.entity.Tankfull8BlockEntity;
import net.elec_tronics.block.entity.Tankfull7BlockEntity;
import net.elec_tronics.block.entity.Tankfull6BlockEntity;
import net.elec_tronics.block.entity.Tankfull5BlockEntity;
import net.elec_tronics.block.entity.Tankfull4BlockEntity;
import net.elec_tronics.block.entity.Tankfull3BlockEntity;
import net.elec_tronics.block.entity.Tankfull2BlockEntity;
import net.elec_tronics.block.entity.Tankfull1BlockEntity;
import net.elec_tronics.block.entity.Tankfull14BlockEntity;
import net.elec_tronics.block.entity.Tankfull13BlockEntity;
import net.elec_tronics.block.entity.Tankfull12BlockEntity;
import net.elec_tronics.block.entity.Tankfull11BlockEntity;
import net.elec_tronics.block.entity.Tankfull10BlockEntity;
import net.elec_tronics.block.entity.TankBlockEntity;
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
import net.elec_tronics.block.entity.ManualFluidPumpdown2BlockEntity;
import net.elec_tronics.block.entity.ManualFluidPumpBlockEntity;
import net.elec_tronics.block.entity.ManualFluidPump5BlockEntity;
import net.elec_tronics.block.entity.ManualFluidPump4BlockEntity;
import net.elec_tronics.block.entity.ManualFluidPump3BlockEntity;
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
import net.elec_tronics.ElecTronicsMod;

public class ElecTronicsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ElecTronicsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BLASTFURNANCEMACHINE = register("blastfurnancemachine", ElecTronicsModBlocks.BLASTFURNANCEMACHINE, BlastfurnancemachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENGINEERSWORKBENCH = register("engineersworkbench", ElecTronicsModBlocks.ENGINEERSWORKBENCH, EngineersworkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COALGENERATORMACHINE = register("coalgeneratormachine", ElecTronicsModBlocks.COALGENERATORMACHINE, CoalgeneratormachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUSHERMACHINE = register("crushermachine", ElecTronicsModBlocks.CRUSHERMACHINE, CrushermachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> T_1_WIRE = register("t_1_wire", ElecTronicsModBlocks.T_1_WIRE, T1WireBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TT_1 = register("cable_tt_1", ElecTronicsModBlocks.CABLE_TT_1, CableTT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_JUNCTION_T_1 = register("cable_junction_t_1", ElecTronicsModBlocks.CABLE_JUNCTION_T_1, CableJunctionT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_ANGLE_T_1 = register("cable_angle_t_1", ElecTronicsModBlocks.CABLE_ANGLE_T_1, CableAngleT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENGINEERS_WORK_BENCH_SIDE = register("engineers_work_bench_side", ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_SIDE, EngineersWorkBenchSideBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENGINEERS_WORK_BENCH_TOP = register("engineers_work_bench_top", ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP, EngineersWorkBenchTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENGINEERS_WORK_BENCH_TOP_SIDE = register("engineers_work_bench_top_side", ElecTronicsModBlocks.ENGINEERS_WORK_BENCH_TOP_SIDE, EngineersWorkBenchTopSideBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_T_UP_T_1 = register("cable_t_up_t_1", ElecTronicsModBlocks.CABLE_T_UP_T_1, CableTUpT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_T_DOWN_T_1 = register("cable_t_down_t_1", ElecTronicsModBlocks.CABLE_T_DOWN_T_1, CableTDownT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_T_UPAND_DOWN_T_1 = register("cable_t_upand_down_t_1", ElecTronicsModBlocks.CABLE_T_UPAND_DOWN_T_1, CableTUpandDownT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_JUNCTION_UP_T_1 = register("cable_junction_up_t_1", ElecTronicsModBlocks.CABLE_JUNCTION_UP_T_1, CableJunctionUpT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_JUNCTION_DOWN_T_1 = register("cable_junction_down_t_1", ElecTronicsModBlocks.CABLE_JUNCTION_DOWN_T_1, CableJunctionDownT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_JUNCTION_UPAND_DOWN_T_1 = register("cable_junction_upand_down_t_1", ElecTronicsModBlocks.CABLE_JUNCTION_UPAND_DOWN_T_1, CableJunctionUpandDownT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASECABLE_T_1 = register("basecable_t_1", ElecTronicsModBlocks.BASECABLE_T_1, BasecableT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLEHALF_T_1 = register("cablehalf_t_1", ElecTronicsModBlocks.CABLEHALF_T_1, CablehalfT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_2ANGLE = register("basewirecon_2angle", ElecTronicsModBlocks.BASEWIRECON_2ANGLE, Basewirecon2angleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_2ANGLEDOWN = register("basewirecon_2angledown", ElecTronicsModBlocks.BASEWIRECON_2ANGLEDOWN, Basewirecon2angledownBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_2ANGLEUP = register("basewirecon_2angleup", ElecTronicsModBlocks.BASEWIRECON_2ANGLEUP, Basewirecon2angleupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_3 = register("basewirecon_3", ElecTronicsModBlocks.BASEWIRECON_3, Basewirecon3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_3DOWN = register("basewirecon_3down", ElecTronicsModBlocks.BASEWIRECON_3DOWN, Basewirecon3downBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_3DOWNANDUP = register("basewirecon_3downandup", ElecTronicsModBlocks.BASEWIRECON_3DOWNANDUP, Basewirecon3downandupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_3DOWNANGLE = register("basewirecon_3downangle", ElecTronicsModBlocks.BASEWIRECON_3DOWNANGLE, Basewirecon3downangleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_3UP = register("basewirecon_3up", ElecTronicsModBlocks.BASEWIRECON_3UP, Basewirecon3upBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_3UPANGLE = register("basewirecon_3upangle", ElecTronicsModBlocks.BASEWIRECON_3UPANGLE, Basewirecon3upangleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_4DOWN = register("basewirecon_4down", ElecTronicsModBlocks.BASEWIRECON_4DOWN, Basewirecon4downBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_4UP = register("basewirecon_4up", ElecTronicsModBlocks.BASEWIRECON_4UP, Basewirecon4upBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_4UPANDDOWN = register("basewirecon_4upanddown", ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWN, Basewirecon4upanddownBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_4UPANDDOWNSTRAIGHT = register("basewirecon_4upanddownstraight", ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWNSTRAIGHT, Basewirecon4upanddownstraightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_5DOWN = register("basewirecon_5down", ElecTronicsModBlocks.BASEWIRECON_5DOWN, Basewirecon5downBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEWIRECON_5MAIN = register("basewirecon_5main", ElecTronicsModBlocks.BASEWIRECON_5MAIN, Basewirecon5mainBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_T_1 = register("solar_panel_t_1", ElecTronicsModBlocks.SOLAR_PANEL_T_1, SolarPanelT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANELR = register("solar_panelr", ElecTronicsModBlocks.SOLAR_PANELR, SolarPanelrBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLARPANELTOP = register("solarpaneltop", ElecTronicsModBlocks.SOLARPANELTOP, SolarpaneltopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLARPANELTOPR = register("solarpaneltopr", ElecTronicsModBlocks.SOLARPANELTOPR, SolarpaneltoprBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXTRUSION_MACHINE = register("extrusion_machine", ElecTronicsModBlocks.EXTRUSION_MACHINE, ExtrusionMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENERGY_STORAGE_T_1 = register("energy_storage_t_1", ElecTronicsModBlocks.ENERGY_STORAGE_T_1, EnergyStorageT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASEPIPE = register("basepipe", ElecTronicsModBlocks.BASEPIPE, BasepipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEANGLE = register("pipeangle", ElecTronicsModBlocks.PIPEANGLE, PipeangleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEANGLEDOWN = register("pipeangledown", ElecTronicsModBlocks.PIPEANGLEDOWN, PipeangledownBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEANLGEUP = register("pipeanlgeup", ElecTronicsModBlocks.PIPEANLGEUP, PipeanlgeupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEDOWNANGLE = register("pipedownangle", ElecTronicsModBlocks.PIPEDOWNANGLE, PipedownangleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEHALF = register("pipehalf", ElecTronicsModBlocks.PIPEHALF, PipehalfBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTION = register("pipejunction", ElecTronicsModBlocks.PIPEJUNCTION, PipejunctionBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONDOWN = register("pipejunctiondown", ElecTronicsModBlocks.PIPEJUNCTIONDOWN, PipejunctiondownBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONDOWN_2 = register("pipejunctiondown_2", ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2, Pipejunctiondown2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONMAIN = register("pipejunctionmain", ElecTronicsModBlocks.PIPEJUNCTIONMAIN, PipejunctionmainBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONUP = register("pipejunctionup", ElecTronicsModBlocks.PIPEJUNCTIONUP, PipejunctionupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONUP_2 = register("pipejunctionup_2", ElecTronicsModBlocks.PIPEJUNCTIONUP_2, Pipejunctionup2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONUPANDDOWN = register("pipejunctionupanddown", ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN, PipejunctionupanddownBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONUPANDDOWN_2 = register("pipejunctionupanddown_2", ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2, Pipejunctionupanddown2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEJUNCTIONUPANDDOWNSTRAIGHT = register("pipejunctionupanddownstraight", ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT, PipejunctionupanddownstraightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPESTRAIGHT = register("pipestraight", ElecTronicsModBlocks.PIPESTRAIGHT, PipestraightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPET = register("pipet", ElecTronicsModBlocks.PIPET, PipetBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPETDOWN = register("pipetdown", ElecTronicsModBlocks.PIPETDOWN, PipetdownBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPETDOWNANDUP = register("pipetdownandup", ElecTronicsModBlocks.PIPETDOWNANDUP, PipetdownandupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEUP = register("pipeup", ElecTronicsModBlocks.PIPEUP, PipeupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEUPANGLE = register("pipeupangle", ElecTronicsModBlocks.PIPEUPANGLE, PipeupangleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANK = register("tank", ElecTronicsModBlocks.TANK, TankBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_1 = register("tankfull_1", ElecTronicsModBlocks.TANKFULL_1, Tankfull1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_2 = register("tankfull_2", ElecTronicsModBlocks.TANKFULL_2, Tankfull2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_3 = register("tankfull_3", ElecTronicsModBlocks.TANKFULL_3, Tankfull3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_4 = register("tankfull_4", ElecTronicsModBlocks.TANKFULL_4, Tankfull4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_5 = register("tankfull_5", ElecTronicsModBlocks.TANKFULL_5, Tankfull5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_6 = register("tankfull_6", ElecTronicsModBlocks.TANKFULL_6, Tankfull6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_7 = register("tankfull_7", ElecTronicsModBlocks.TANKFULL_7, Tankfull7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_8 = register("tankfull_8", ElecTronicsModBlocks.TANKFULL_8, Tankfull8BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_9 = register("tankfull_9", ElecTronicsModBlocks.TANKFULL_9, Tankfull9BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_10 = register("tankfull_10", ElecTronicsModBlocks.TANKFULL_10, Tankfull10BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_11 = register("tankfull_11", ElecTronicsModBlocks.TANKFULL_11, Tankfull11BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_12 = register("tankfull_12", ElecTronicsModBlocks.TANKFULL_12, Tankfull12BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_13 = register("tankfull_13", ElecTronicsModBlocks.TANKFULL_13, Tankfull13BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULL_14 = register("tankfull_14", ElecTronicsModBlocks.TANKFULL_14, Tankfull14BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANUAL_FLUID_PUMP = register("manual_fluid_pump", ElecTronicsModBlocks.MANUAL_FLUID_PUMP, ManualFluidPumpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANUAL_FLUID_PUMPDOWN_2 = register("manual_fluid_pumpdown_2", ElecTronicsModBlocks.MANUAL_FLUID_PUMPDOWN_2, ManualFluidPumpdown2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANUAL_FLUID_PUMP_3 = register("manual_fluid_pump_3", ElecTronicsModBlocks.MANUAL_FLUID_PUMP_3, ManualFluidPump3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANUAL_FLUID_PUMP_4 = register("manual_fluid_pump_4", ElecTronicsModBlocks.MANUAL_FLUID_PUMP_4, ManualFluidPump4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANUAL_FLUID_PUMP_5 = register("manual_fluid_pump_5", ElecTronicsModBlocks.MANUAL_FLUID_PUMP_5, ManualFluidPump5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANKFULLHALF_1 = register("tankfullhalf_1", ElecTronicsModBlocks.TANKFULLHALF_1, Tankfullhalf1BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

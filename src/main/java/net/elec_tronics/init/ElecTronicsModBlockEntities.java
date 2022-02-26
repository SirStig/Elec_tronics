
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
import net.elec_tronics.block.entity.EngineersworkbenchBlockEntity;
import net.elec_tronics.block.entity.EngineersWorkBenchTopSideBlockEntity;
import net.elec_tronics.block.entity.EngineersWorkBenchTopBlockEntity;
import net.elec_tronics.block.entity.EngineersWorkBenchSideBlockEntity;
import net.elec_tronics.block.entity.CrushermachineBlockEntity;
import net.elec_tronics.block.entity.CoalgeneratormachineBlockEntity;
import net.elec_tronics.block.entity.CableTT1BlockEntity;
import net.elec_tronics.block.entity.CableJunctionT1BlockEntity;
import net.elec_tronics.block.entity.CableAngleT1BlockEntity;
import net.elec_tronics.block.entity.BlastfurnancemachineBlockEntity;

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

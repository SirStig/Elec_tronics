package net.elec_tronics.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.elec_tronics.network.ElecTronicsModVariables;
import net.elec_tronics.init.ElecTronicsModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldiniProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.BASEPIPE.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEHALF.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPESTRAIGHT.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEANGLE.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEANGLEDOWN.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEANLGEUP.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEDOWNANGLE.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEUPANGLE.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEUP.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPETDOWNANDUP.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTION.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUP.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUP_2.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONMAIN.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2.get());
		ElecTronicsModVariables.blockStates_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASECABLE_T_1.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.CABLEHALF_T_1.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.T_1_WIRE.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_5MAIN.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_4DOWN.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_2ANGLEUP.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_3DOWN.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_3UP.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_4UP.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_2ANGLEDOWN.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWN.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_3UPANGLE.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_3.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_5DOWN.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_2ANGLE.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_4UPANDDOWNSTRAIGHT.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_3DOWNANDUP.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.BASEWIRECON_3DOWNANGLE.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.CABLE_JUNCTION_T_1.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.CABLE_JUNCTION_UP_T_1.get());
		ElecTronicsModVariables.blockStates_wires.add(ElecTronicsModBlocks.CABLE_JUNCTION_UPAND_DOWN_T_1.get());
	}
}

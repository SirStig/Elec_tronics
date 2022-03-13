package net.elec_tronics.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.WorldEvent;

import net.elec_tronics.network.ElecTronicsModVariables;
import net.elec_tronics.init.ElecTronicsModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldiniProcedure {
	@SubscribeEvent
	public static void onWorldLoad(WorldEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.BASEPIPE);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEHALF);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPESTRAIGHT);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEANGLE);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEANGLEDOWN);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEANLGEUP);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEDOWNANGLE);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEUPANGLE);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEUP);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPETDOWNANDUP);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTION);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONDOWN);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUP);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUP_2);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONMAIN);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2);
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2);
	}
}

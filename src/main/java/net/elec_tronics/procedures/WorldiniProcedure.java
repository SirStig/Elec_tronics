package net.elec_tronics.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.item.ItemStack;

import net.elec_tronics.network.ElecTronicsModVariables;
import net.elec_tronics.init.ElecTronicsModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldiniProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		ItemStack currentITEM = ItemStack.EMPTY;
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.BASEPIPE.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEHALF.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPESTRAIGHT.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEANGLE.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEANGLEDOWN.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEANLGEUP.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEDOWNANGLE.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEUPANGLE.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEUP.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPETDOWNANDUP.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTION.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUP.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUP_2.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONMAIN.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2.get());
		ElecTronicsModVariables.list_pipes.add(ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2.get());
	}
}

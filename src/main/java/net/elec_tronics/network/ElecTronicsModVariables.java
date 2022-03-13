package net.elec_tronics.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElecTronicsModVariables {
	public static List<Block> list_pipes = new ArrayList<Block>();

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}

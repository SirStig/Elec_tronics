
package net.elec_tronics.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModFluids;

public class ElectronicsoilBlock extends LiquidBlock {
	public ElectronicsoilBlock() {
		super(ElecTronicsModFluids.ELECTRONICSOIL, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_BLACK).strength(5f)

		);
		setRegistryName("electronicsoil");
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 1;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}

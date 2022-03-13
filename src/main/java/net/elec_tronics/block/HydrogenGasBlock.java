
package net.elec_tronics.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HydrogenGasBlock extends LiquidBlock {
	public HydrogenGasBlock() {
		super(ElecTronicsModFluids.HYDROGEN_GAS, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("hydrogen_gas");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}
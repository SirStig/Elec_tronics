
package net.elec_tronics.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.elec_tronics.init.ElecTronicsModFluids;
import net.elec_tronics.init.ElecTronicsModFluidTypes;
import net.elec_tronics.init.ElecTronicsModBlocks;

public abstract class ChlorineGasFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElecTronicsModFluidTypes.CHLORINE_GAS_TYPE.get(), () -> ElecTronicsModFluids.CHLORINE_GAS.get(),
			() -> ElecTronicsModFluids.FLOWING_CHLORINE_GAS.get()).explosionResistance(100f).tickRate(2).block(() -> (LiquidBlock) ElecTronicsModBlocks.CHLORINE_GAS.get());

	private ChlorineGasFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ChlorineGasFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ChlorineGasFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

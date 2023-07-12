
package net.elec_tronics.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.elec_tronics.init.ElecTronicsModFluids;
import net.elec_tronics.init.ElecTronicsModFluidTypes;
import net.elec_tronics.init.ElecTronicsModBlocks;

public abstract class RefinedOilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElecTronicsModFluidTypes.REFINED_OIL_TYPE.get(), () -> ElecTronicsModFluids.REFINED_OIL.get(),
			() -> ElecTronicsModFluids.FLOWING_REFINED_OIL.get()).explosionResistance(5f).tickRate(10).levelDecreasePerBlock(2).block(() -> (LiquidBlock) ElecTronicsModBlocks.REFINED_OIL.get());

	private RefinedOilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RefinedOilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RefinedOilFluid {
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

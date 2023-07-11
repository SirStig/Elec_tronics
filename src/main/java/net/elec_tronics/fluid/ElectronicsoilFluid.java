
package net.elec_tronics.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.elec_tronics.init.ElecTronicsModItems;
import net.elec_tronics.init.ElecTronicsModFluids;
import net.elec_tronics.init.ElecTronicsModFluidTypes;
import net.elec_tronics.init.ElecTronicsModBlocks;

public abstract class ElectronicsoilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElecTronicsModFluidTypes.OIL_TYPE.get(), () -> ElecTronicsModFluids.OIL.get(), () -> ElecTronicsModFluids.FLOWING_OIL.get())
			.explosionResistance(5f).tickRate(10).levelDecreasePerBlock(2).bucket(() -> ElecTronicsModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) ElecTronicsModBlocks.OIL.get());

	private ElectronicsoilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ElectronicsoilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ElectronicsoilFluid {
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

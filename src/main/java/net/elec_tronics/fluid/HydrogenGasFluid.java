
package net.elec_tronics.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.elec_tronics.init.ElecTronicsModFluids;
import net.elec_tronics.init.ElecTronicsModBlocks;

public abstract class HydrogenGasFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElecTronicsModFluids.HYDROGEN_GAS,
			() -> ElecTronicsModFluids.FLOWING_HYDROGEN_GAS,
			FluidAttributes
					.builder(new ResourceLocation("elec_tronics:blocks/hydrogengash2"), new ResourceLocation("elec_tronics:blocks/hydrogengash2"))

					.gaseous()

	).explosionResistance(100f)

			.tickRate(2)

			.block(() -> (LiquidBlock) ElecTronicsModBlocks.HYDROGEN_GAS);

	private HydrogenGasFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HydrogenGasFluid {
		public Source() {
			super();
			setRegistryName("hydrogen_gas");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HydrogenGasFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_hydrogen_gas");
		}

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

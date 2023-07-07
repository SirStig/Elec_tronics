
package net.elec_tronics.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.elec_tronics.init.ElecTronicsModItems;
import net.elec_tronics.init.ElecTronicsModFluids;
import net.elec_tronics.init.ElecTronicsModFluidTypes;
import net.elec_tronics.init.ElecTronicsModBlocks;

public abstract class BrineFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElecTronicsModFluidTypes.BRINE_TYPE.get(), () -> ElecTronicsModFluids.BRINE.get(), () -> ElecTronicsModFluids.FLOWING_BRINE.get())
			.explosionResistance(100f).bucket(() -> ElecTronicsModItems.BRINE_BUCKET.get()).block(() -> (LiquidBlock) ElecTronicsModBlocks.BRINE.get());

	private BrineFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends BrineFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BrineFluid {
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


package net.elec_tronics.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModItems;
import net.elec_tronics.init.ElecTronicsModFluids;
import net.elec_tronics.init.ElecTronicsModBlocks;

public abstract class ElectronicsoilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElecTronicsModFluids.ELECTRONICSOIL,
			() -> ElecTronicsModFluids.FLOWING_ELECTRONICSOIL,
			FluidAttributes.builder(new ResourceLocation("elec_tronics:blocks/oil_still"), new ResourceLocation("elec_tronics:blocks/oil_flow"))

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava"))))
							.explosionResistance(5f)

							.tickRate(10).levelDecreasePerBlock(2)

							.bucket(() -> ElecTronicsModItems.ELECTRONICSOIL_BUCKET).block(() -> (LiquidBlock) ElecTronicsModBlocks.ELECTRONICSOIL);

	private ElectronicsoilFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-0.4);
	}

	public static class Source extends ElectronicsoilFluid {
		public Source() {
			super();
			setRegistryName("electronicsoil");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ElectronicsoilFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_electronicsoil");
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

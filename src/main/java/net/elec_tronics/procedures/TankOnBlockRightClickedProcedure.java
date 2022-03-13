package net.elec_tronics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TankOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElecTronicsModItems.CREATIVEFLUIDDROPPER) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y)), (int) (Math.floor(z))),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((Math.floor(x)), (Math.floor(y)), (Math.floor(z)),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y)), (int) (Math.floor(z))));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(
							capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		}
	}
}

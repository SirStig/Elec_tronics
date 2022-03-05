package net.elec_tronics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class T1CableProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = -1;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = -1;
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if ((new Object() {
						public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
							AtomicBoolean _retval = new AtomicBoolean(false);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
							return _retval.get();
						}
					}.canReceiveEnergy(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))) == true) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}

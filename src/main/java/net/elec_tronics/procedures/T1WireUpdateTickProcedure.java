package net.elec_tronics.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class T1WireUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean send4 = false;
		boolean send5 = false;
		boolean send6 = false;
		boolean send2 = false;
		boolean send3 = false;
		boolean send = false;
		double energyDown = 0;
		double energyWest = 0;
		double energySouth = 0;
		double energyNorth = 0;
		double energyUp = 0;
		double energyEast = 0;
		double localEnergy = 0;
		double zsend5 = 0;
		double zsend4 = 0;
		double zsend3 = 0;
		double zsend2 = 0;
		double zsend6 = 0;
		double xsend = 0;
		double amountOfRecievers = 0;
		double ysend = 0;
		double energy6 = 0;
		double energy5 = 0;
		double energy4 = 0;
		double energy3 = 0;
		double energy2 = 0;
		double energy1 = 0;
		double amountToSend = 0;
		double ysend5 = 0;
		double ysend6 = 0;
		double ysend3 = 0;
		double ysend4 = 0;
		double zsend = 0;
		double ysend2 = 0;
		double xsend3 = 0;
		double xsend2 = 0;
		double xsend5 = 0;
		double xsend4 = 0;
		double xsend6 = 0;
		if ((new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos((int) x, (int) y, (int) (z - 1)))) == true) {
			energy1 = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 100000);
			energy1 = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) energy1);
			send = true;
			xsend = x;
			amountOfRecievers = amountOfRecievers + 1;
			ysend = y;
			zsend = z - 1;
		} else {
			send = false;
		}
		if ((new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos((int) x, (int) y, (int) (z + 1)))) == true) {
			energy2 = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 100000);
			energy2 = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos((int) x, (int) y, (int) (z + 1)), (int) energy2);
			amountOfRecievers = amountOfRecievers + 1;
			send2 = true;
			xsend2 = x;
			ysend2 = y;
			zsend2 = z + 1;
		} else {
			send2 = false;
		}
		if ((new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos((int) x, (int) (y - 1), (int) z))) == true) {
			energy3 = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 100000);
			energy3 = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos((int) x, (int) (y - 1), (int) z), (int) energy3);
			amountOfRecievers = amountOfRecievers + 1;
			send3 = true;
			xsend3 = x;
			ysend3 = y - 1;
			zsend3 = z;
		} else {
			send3 = false;
		}
		if ((new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos((int) x, (int) (y + 1), (int) z))) == true) {
			energy4 = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 100000);
			energy4 = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos((int) x, (int) (y + 1), (int) z), (int) energy4);
			amountOfRecievers = amountOfRecievers + 1;
			send4 = true;
			xsend4 = x;
			ysend4 = y + 1;
			zsend4 = z;
		} else {
			send4 = false;
		}
		if ((new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos((int) (x - 1), (int) y, (int) z))) == true) {
			energy5 = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 100000);
			energy5 = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos((int) (x - 1), (int) y, (int) z), (int) energy5);
			amountOfRecievers = amountOfRecievers + 1;
			send5 = true;
			xsend5 = x - 1;
			ysend5 = y;
			zsend5 = z;
		} else {
			send5 = false;
		}
		if ((new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos((int) (x + 1), (int) y, (int) z))) == true) {
			energy6 = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 100000);
			energy6 = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos((int) (x + 1), (int) y, (int) z), (int) energy6);
			amountOfRecievers = amountOfRecievers + 1;
			send6 = true;
			xsend6 = x + 1;
			ysend6 = y;
			zsend6 = z;
		} else {
			send6 = false;
		}
		amountToSend = (energy1 + energy2 + energy3 + energy4 + energy5 + energy6) / amountOfRecievers;
		if (send == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend, (int) ysend, (int) zsend));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (send2 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend2, (int) ysend2, (int) zsend2));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (send3 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend3, (int) ysend3, (int) zsend3));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (send4 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend4, (int) ysend4, (int) zsend4));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (send5 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend5, (int) ysend5, (int) zsend5));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (send6 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend6, (int) ysend6, (int) zsend6));
				int _amount = (int) amountToSend;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}

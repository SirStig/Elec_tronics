package net.elec_tronics.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.elec_tronics.network.ElecTronicsModVariables;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

public class T1WireUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean send4 = false;
		boolean send5 = false;
		boolean send6 = false;
		boolean send2 = false;
		boolean send3 = false;
		boolean send = false;
		boolean found = false;
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
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double wire = 0;
		amountOfRecievers = 0;
		energy1 = 0;
		energy2 = 0;
		energy3 = 0;
		energy4 = 0;
		energy5 = 0;
		energy6 = 0;
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
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 10000);
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
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 10000);
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
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 10000);
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
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 10000);
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
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 10000);
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
			}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) z), 10000);
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
		energy1 = energy1 / amountOfRecievers;
		energy2 = energy2 / amountOfRecievers;
		energy3 = energy3 / amountOfRecievers;
		energy4 = energy4 / amountOfRecievers;
		energy5 = energy5 / amountOfRecievers;
		energy6 = energy6 / amountOfRecievers;
		if (send == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend, (int) ysend, (int) zsend));
				int _amount = (int) energy1;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) energy1;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (send2 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend2, (int) ysend2, (int) zsend2));
				int _amount = (int) energy2;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) energy2;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (send3 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend3, (int) ysend3, (int) zsend3));
				int _amount = (int) energy3;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) energy3;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (send4 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend4, (int) ysend4, (int) zsend4));
				int _amount = (int) energy4;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) energy4;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (send5 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend5, (int) ysend5, (int) zsend5));
				int _amount = (int) energy5;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) energy5;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (send6 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) xsend6, (int) ysend6, (int) zsend6));
				int _amount = (int) energy6;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) energy6;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "blockStateChanged")) == true) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = ElecTronicsModVariables.list_pipes.get((int) (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "blockState"))).defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.save(new CompoundTag());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("blockStateChanged", (false));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

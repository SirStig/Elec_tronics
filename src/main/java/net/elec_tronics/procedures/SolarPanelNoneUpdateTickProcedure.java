package net.elec_tronics.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModBlocks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import java.util.ArrayList;

public class SolarPanelNoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean send4 = false;
		boolean send5 = false;
		boolean send6 = false;
		boolean send2 = false;
		boolean send3 = false;
		boolean send = false;
		boolean found = false;
		List<Object> panelX = new ArrayList<>();
		List<Object> panelY = new ArrayList<>();
		List<Object> panelZ = new ArrayList<>();
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
		double totalReceivers = 0;
		double time = 0;
		double solarPower = 0;
		double index = 0;
		sx = -2;
		found = false;
		for (int index0 = 0; index0 < 4; index0++) {
			sy = -2;
			for (int index1 = 0; index1 < 4; index1++) {
				sz = -2;
				for (int index2 = 0; index2 < 4; index2++) {
					if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock())
							&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLAR_PANEL_T_1.get()
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLAR_PANELR.get()
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLARPANELTOP.get()
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ElecTronicsModBlocks.SOLARPANELTOPR.get())) {
						found = true;
						panelX.add((x + sx));
						panelY.add((y + sy));
						panelZ.add((z + sz));
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		time = ReturnTimeOfDayProcedure.execute(world);
		if (time >= 7 && time <= 10) {
			solarPower = 50 / 2;
		} else if (time > 10 && time <= 16) {
			solarPower = 50 / 1;
		} else if (time > 16 && time <= 20) {
			solarPower = 50 / 2.5;
		} else {
			solarPower = 0;
		}
		if (found == true) {
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
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) == true && !(world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("electronics:generators")))) {
				energy1 = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), (int) solarPower);
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
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) == true && !(world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("electronics:generators")))) {
				energy2 = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), (int) solarPower);
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
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) == true && !(world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("electronics:generators")))) {
				energy3 = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), (int) solarPower);
				amountOfRecievers = amountOfRecievers + 1;
				send3 = true;
				xsend3 = x;
				ysend3 = y - 1;
				zsend3 = z;
			} else {
				send3 = false;
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("electronics:generators"))) && !((new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y + 1, z))) == true)) {
				energy4 = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), (int) solarPower);
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
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) == true && !(world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("electronics:generators")))) {
				energy5 = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x - 1, y, z), (int) solarPower);
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
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) == true && !(world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("electronics:generators")))) {
				energy6 = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), (int) solarPower);
				amountOfRecievers = amountOfRecievers + 1;
				send6 = true;
				xsend6 = x + 1;
				ysend6 = y;
				zsend6 = z;
			} else {
				send6 = false;
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("amountOfReceivers", amountOfRecievers);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			index = 0;
			totalReceivers = amountOfRecievers;
			for (int index3 = 0; index3 < (int) panelX.size(); index3++) {
				totalReceivers = totalReceivers + new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(panelX.get((int) index) instanceof Double _d ? _d : 0, panelY.get((int) index) instanceof Double _d ? _d : 0, panelZ.get((int) index) instanceof Double _d ? _d : 0), "amountOfReceivers");
				index = index + 1;
			}
			energy1 = energy1 / totalReceivers;
			energy2 = energy2 / totalReceivers;
			energy3 = energy3 / totalReceivers;
			energy4 = energy4 / totalReceivers;
			energy5 = energy5 / totalReceivers;
			energy6 = energy6 / totalReceivers;
			if (world instanceof Level _lvl44 && _lvl44.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
				if (send == true) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend, ysend, zsend));
						int _amount = (int) energy1;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (send2 == true) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend2, ysend2, zsend2));
						int _amount = (int) energy2;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (send3 == true) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend3, ysend3, zsend3));
						int _amount = (int) energy3;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (send4 == true) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend4, ysend4, zsend4));
						int _amount = (int) energy4;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (send5 == true) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend5, ysend5, zsend5));
						int _amount = (int) energy5;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (send6 == true) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend6, ysend6, zsend6));
						int _amount = (int) energy6;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
			}
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}

package net.elec_tronics.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.elec_tronics.network.ElecTronicsModVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class BasepipeUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean send4 = false;
		boolean send5 = false;
		boolean send6 = false;
		boolean send2 = false;
		boolean send3 = false;
		boolean send = false;
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
		amountOfRecievers = 0;
		energy1 = 0;
		energy2 = 0;
		energy3 = 0;
		energy4 = 0;
		energy5 = 0;
		energy6 = 0;
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, BlockPos.containing(x, y, z - 1), 1) != new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, BlockPos.containing(x, y, z - 1), 1)) {
			energy1 = new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 1000000);
			energy1 = new Object() {
				public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
					return _retval.get();
				}
			}.fillTankSimulate(world, BlockPos.containing(x, y, z - 1), (int) energy1);
			send = true;
			xsend = x;
			amountOfRecievers = amountOfRecievers + 1;
			ysend = y;
			zsend = z - 1;
		} else {
			send = false;
		}
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, BlockPos.containing(x, y, z + 1), 1) != new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, BlockPos.containing(x, y, z + 1), 1)) {
			energy2 = new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 1000000);
			energy2 = new Object() {
				public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
					return _retval.get();
				}
			}.fillTankSimulate(world, BlockPos.containing(x, y, z + 1), (int) energy2);
			amountOfRecievers = amountOfRecievers + 1;
			send2 = true;
			xsend2 = x;
			ysend2 = y;
			zsend2 = z + 1;
		} else {
			send2 = false;
		}
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, BlockPos.containing(x, y - 1, z), 1) != new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, BlockPos.containing(x, y - 1, z), 1)) {
			energy3 = new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 1000000);
			energy3 = new Object() {
				public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
					return _retval.get();
				}
			}.fillTankSimulate(world, BlockPos.containing(x, y - 1, z), (int) energy3);
			amountOfRecievers = amountOfRecievers + 1;
			send3 = true;
			xsend3 = x;
			ysend3 = y - 1;
			zsend3 = z;
		} else {
			send3 = false;
		}
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, BlockPos.containing(x, y + 1, z), 1) != new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, BlockPos.containing(x, y + 1, z), 1)) {
			energy4 = new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 1000000);
			energy4 = new Object() {
				public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
					return _retval.get();
				}
			}.fillTankSimulate(world, BlockPos.containing(x, y + 1, z), (int) energy4);
			amountOfRecievers = amountOfRecievers + 1;
			send4 = true;
			xsend4 = x;
			ysend4 = y + 1;
			zsend4 = z;
		} else {
			send4 = false;
		}
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, BlockPos.containing(x - 1, y, z), 1) != new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, BlockPos.containing(x - 1, y, z), 1)) {
			energy5 = new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 1000000);
			energy5 = new Object() {
				public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
					return _retval.get();
				}
			}.fillTankSimulate(world, BlockPos.containing(x - 1, y, z), (int) energy5);
			amountOfRecievers = amountOfRecievers + 1;
			send5 = true;
			xsend5 = x - 1;
			ysend5 = y;
			zsend5 = z;
		} else {
			send5 = false;
		}
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, BlockPos.containing(x + 1, y, z), 1) != new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, BlockPos.containing(x + 1, y, z), 1)) {
			energy6 = new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 1000000);
			energy6 = new Object() {
				public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
					return _retval.get();
				}
			}.fillTankSimulate(world, BlockPos.containing(x + 1, y, z), (int) energy6);
			amountOfRecievers = amountOfRecievers + 1;
			send6 = true;
			xsend6 = x + 1;
			ysend6 = y;
			zsend6 = z;
		} else {
			send6 = false;
		}
		energy1 = (energy1 / amountOfRecievers) * ElecTronicsModVariables.MapVariables.get(world).water_multiplier;
		energy2 = (energy2 / amountOfRecievers) * ElecTronicsModVariables.MapVariables.get(world).water_multiplier;
		energy3 = (energy3 / amountOfRecievers) * ElecTronicsModVariables.MapVariables.get(world).water_multiplier;
		energy4 = (energy4 / amountOfRecievers) * ElecTronicsModVariables.MapVariables.get(world).water_multiplier;
		energy5 = (energy5 / amountOfRecievers) * ElecTronicsModVariables.MapVariables.get(world).water_multiplier;
		energy6 = (energy6 / amountOfRecievers) * ElecTronicsModVariables.MapVariables.get(world).water_multiplier;
		if (send == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend, ysend, zsend));
				int _amount = (int) energy1;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy1;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if (send2 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend2, ysend2, zsend2));
				int _amount = (int) energy2;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy2;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if (send3 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend3, ysend3, zsend3));
				int _amount = (int) energy3;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy3;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if (send4 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend4, ysend4, zsend4));
				int _amount = (int) energy4;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy4;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if (send5 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend5, ysend5, zsend5));
				int _amount = (int) energy5;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy5;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if (send6 == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(xsend6, ysend6, zsend6));
				int _amount = (int) energy6;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy6;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
			}
		}
	}
}

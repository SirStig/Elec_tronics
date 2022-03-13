package net.elec_tronics.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.FluidStack;

import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class ManualFluidPumpSendWaterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean liquidNear = false;
		double amount = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		liquidNear = false;
		for (int index0 = 0; index0 < (int) (12); index0++) {
			sy = -6;
			for (int index1 = 0; index1 < (int) (12); index1++) {
				sz = -6;
				for (int index2 = 0; index2 < (int) (12); index2++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
							.getBlock() instanceof LiquidBlock == true) {
						liquidNear = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (liquidNear == true) {
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property)instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property)instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval
										.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, new BlockPos((int) x, (int) y, (int) (z - 1)), 5);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(
									capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") == 1000) {
					world.setBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property)instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property)instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval
										.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, new BlockPos((int) x, (int) y, (int) (z + 1)), 5);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z + 1)));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(
									capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") == 1000) {
					world.setBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property)instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property)instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST) {
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval
										.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, new BlockPos((int) (x - 1), (int) y, (int) z), 5);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x - 1), (int) y, (int) z));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(
									capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") == 1000) {
					world.setBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property)instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property)instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) {
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval
										.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, new BlockPos((int) (x + 1), (int) y, (int) z), 5);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x + 1), (int) y, (int) z));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(
									capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") == 1000) {
					world.setBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}

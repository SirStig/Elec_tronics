package net.elec_tronics.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
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
		for (int index0 = 0; index0 < 12; index0++) {
			sy = -6;
			for (int index1 = 0; index1 < 12; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof LiquidBlock == true) {
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
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
				if (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, BlockPos.containing(x, y, z - 1), 5);
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") == 1000) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
				if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, BlockPos.containing(x, y, z + 1), 5);
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") == 1000) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
				if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, BlockPos.containing(x - 1, y, z), 5);
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") == 1000) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
				if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == false) {
					amount = new Object() {
						public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.fill(new FluidStack(Fluids.FLOWING_WATER, amount), IFluidHandler.FluidAction.SIMULATE)));
							return _retval.get();
						}
					}.fillTankSimulate(world, BlockPos.containing(x + 1, y, z), 5);
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
						int _amount = (int) amount;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(Fluids.FLOWING_WATER, _amount), IFluidHandler.FluidAction.EXECUTE));
					}
				} else {
					world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.WATER.defaultBlockState(), 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") == 1000) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("usedPercentage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "usedPercentage") + 5));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}

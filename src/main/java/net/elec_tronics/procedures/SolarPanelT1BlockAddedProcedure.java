package net.elec_tronics.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModBlocks;

public class SolarPanelT1BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("generatorID", Math.random());
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
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
			if (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).canOcclude() == false) {
				if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).canOcclude() == false) {
					if (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).canOcclude() == false) {
						world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), ElecTronicsModBlocks.SOLAR_PANELR.defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), ElecTronicsModBlocks.SOLARPANELTOPR.defaultBlockState(),
								3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), ElecTronicsModBlocks.SOLARPANELTOP.defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (world instanceof Level) {
							Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
									new BlockPos((int) x, (int) y, (int) z));
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						}
					}
				} else {
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			} else {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
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
			if (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).canOcclude() == false) {
				if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).canOcclude() == false) {
					if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).canOcclude() == false) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), ElecTronicsModBlocks.SOLAR_PANELR.defaultBlockState(), 3);
						{
							Direction _dir = Direction.WEST;
							BlockPos _pos = new BlockPos((int) x, (int) y, (int) (z + 1));
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), ElecTronicsModBlocks.SOLARPANELTOPR.defaultBlockState(),
								3);
						{
							Direction _dir = Direction.WEST;
							BlockPos _pos = new BlockPos((int) x, (int) (y + 1), (int) (z + 1));
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 1));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), ElecTronicsModBlocks.SOLARPANELTOP.defaultBlockState(), 3);
						{
							Direction _dir = Direction.WEST;
							BlockPos _pos = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (world instanceof Level) {
							Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
									new BlockPos((int) x, (int) y, (int) z));
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						}
					}
				} else {
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			} else {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
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
			if (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).canOcclude() == false) {
				if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).canOcclude() == false) {
					if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).canOcclude() == false) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), ElecTronicsModBlocks.SOLAR_PANELR.defaultBlockState(), 3);
						{
							Direction _dir = Direction.EAST;
							BlockPos _pos = new BlockPos((int) x, (int) y, (int) (z - 1));
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), ElecTronicsModBlocks.SOLARPANELTOPR.defaultBlockState(),
								3);
						{
							Direction _dir = Direction.EAST;
							BlockPos _pos = new BlockPos((int) x, (int) (y + 1), (int) (z - 1));
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 1));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), ElecTronicsModBlocks.SOLARPANELTOP.defaultBlockState(), 3);
						{
							Direction _dir = Direction.EAST;
							BlockPos _pos = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (world instanceof Level) {
							Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
									new BlockPos((int) x, (int) y, (int) z));
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						}
					}
				} else {
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			} else {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
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
			if (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).canOcclude() == false) {
				if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).canOcclude() == false) {
					if (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).canOcclude() == false) {
						world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), ElecTronicsModBlocks.SOLAR_PANELR.defaultBlockState(), 3);
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = new BlockPos((int) (x + 1), (int) y, (int) z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), ElecTronicsModBlocks.SOLARPANELTOPR.defaultBlockState(),
								3);
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = new BlockPos((int) (x + 1), (int) (y + 1), (int) z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), ElecTronicsModBlocks.SOLARPANELTOP.defaultBlockState(), 3);
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("generatorID", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "generatorID")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (world instanceof Level) {
							Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
									new BlockPos((int) x, (int) y, (int) z));
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						}
					}
				} else {
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			} else {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
		}
	}
}

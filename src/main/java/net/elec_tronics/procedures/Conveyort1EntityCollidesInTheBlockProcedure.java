package net.elec_tronics.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Comparator;

public class Conveyort1EntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		if (entity instanceof ItemEntity) {
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
				if (!world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
					entity.setDeltaMovement(new Vec3(0, 0, (-0.125)));
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 0.015), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.015), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
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
				if (!world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
					entity.setDeltaMovement(new Vec3(0, 0, 0.125));
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 0.015), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.015), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
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
				if (!world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
					entity.setDeltaMovement(new Vec3(0.125, 0, 0));
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 0.015), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.015), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
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
				if (!world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
					entity.setDeltaMovement(new Vec3((-0.125), 0, 0));
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 0.015), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.015), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ItemEntity) {
					if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
						if (!(world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ() - 0.25))).is(BlockTags.create(new ResourceLocation("electronics:conveyors")))) {
							slot = 0;
							for (int index0 = 0; index0 < (int) new Object() {
								public int getContainerSize(LevelAccessor world, BlockPos pos) {
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null) {
										if (_ent instanceof BaseContainerBlockEntity _block) {
											return _block.getContainerSize();
										}
									}
									return 0;
								}

								public int getAmount(LevelAccessor world, BlockPos pos) {
									Block block = world.getBlockState(pos).getBlock();
									if (block == Blocks.CHEST || block == Blocks.TRAPPED_CHEST) {
										boolean isSingle = block.getStateDefinition().getProperty("type") instanceof EnumProperty _getep5 && world.getBlockState(pos).getValue(_getep5).toString().equals("SINGLE");
										if (!isSingle) {
											return getContainerSize(world, pos) * 2;
										}
									}
									return getContainerSize(world, pos);
								}
							}.getAmount(world, new BlockPos((int) (entityiterator.getX()), (int) (entityiterator.getY()), (int) (entityiterator.getZ() - 0.25))); index0++) {
								if (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ() - 0.25), (int) slot) == 0 || new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ() - 0.25), (int) slot) != 0
										&& (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ() - 0.25), (int) slot)).getItem()) {
									if (!entityiterator.level.isClientSide())
										entityiterator.discard();
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ() - 0.25));
										if (_ent != null) {
											final int _slotid = (int) slot;
											final ItemStack _setstack = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
											_setstack.setCount((int) (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ() - 0.25), (int) slot) + 1));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
									break;
								}
								slot = slot + 1;
							}
						}
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
						if (!(world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("electronics:conveyors"))) && entityiterator.getZ() <= z - 0.2) {
							slot = 0;
							for (int index1 = 0; index1 < (int) new Object() {
								public int getContainerSize(LevelAccessor world, BlockPos pos) {
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null) {
										if (_ent instanceof BaseContainerBlockEntity _block) {
											return _block.getContainerSize();
										}
									}
									return 0;
								}

								public int getAmount(LevelAccessor world, BlockPos pos) {
									Block block = world.getBlockState(pos).getBlock();
									if (block == Blocks.CHEST || block == Blocks.TRAPPED_CHEST) {
										boolean isSingle = block.getStateDefinition().getProperty("type") instanceof EnumProperty _getep5 && world.getBlockState(pos).getValue(_getep5).toString().equals("SINGLE");
										if (!isSingle) {
											return getContainerSize(world, pos) * 2;
										}
									}
									return getContainerSize(world, pos);
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z + 1))); index1++) {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Found Block"), false);
								if (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(x, y, z + 1), (int) slot) == 0 || new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(x, y, z + 1), (int) slot) != 0 && (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z + 1), (int) slot)).getItem()) {
									if (!entityiterator.level.isClientSide())
										entityiterator.discard();
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
										if (_ent != null) {
											final int _slotid = (int) slot;
											final ItemStack _setstack = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
											_setstack.setCount((int) (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, BlockPos.containing(x, y, z + 1), (int) slot) + 1));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
									if (!world.isClientSide() && world.getServer() != null)
										world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Moved Item"), false);
									break;
								}
								slot = slot + 1;
							}
						}
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
						if (!(world.getBlockState(BlockPos.containing(entityiterator.getX() + 0.125, entityiterator.getY(), entityiterator.getZ()))).is(BlockTags.create(new ResourceLocation("electronics:conveyors")))) {
							slot = 0;
							for (int index2 = 0; index2 < (int) new Object() {
								public int getContainerSize(LevelAccessor world, BlockPos pos) {
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null) {
										if (_ent instanceof BaseContainerBlockEntity _block) {
											return _block.getContainerSize();
										}
									}
									return 0;
								}

								public int getAmount(LevelAccessor world, BlockPos pos) {
									Block block = world.getBlockState(pos).getBlock();
									if (block == Blocks.CHEST || block == Blocks.TRAPPED_CHEST) {
										boolean isSingle = block.getStateDefinition().getProperty("type") instanceof EnumProperty _getep5 && world.getBlockState(pos).getValue(_getep5).toString().equals("SINGLE");
										if (!isSingle) {
											return getContainerSize(world, pos) * 2;
										}
									}
									return getContainerSize(world, pos);
								}
							}.getAmount(world, new BlockPos((int) (entityiterator.getX() + 0.125), (int) (entityiterator.getY()), (int) (entityiterator.getZ()))); index2++) {
								if (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(entityiterator.getX() + 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot) == 0 || new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(entityiterator.getX() + 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot) != 0
										&& (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(entityiterator.getX() + 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot)).getItem()) {
									if (!entityiterator.level.isClientSide())
										entityiterator.discard();
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(entityiterator.getX() + 0.125, entityiterator.getY(), entityiterator.getZ()));
										if (_ent != null) {
											final int _slotid = (int) slot;
											final ItemStack _setstack = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
											_setstack.setCount((int) (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, BlockPos.containing(entityiterator.getX() + 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot) + 1));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
									break;
								}
								slot = slot + 1;
							}
						}
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
						if (!(world.getBlockState(BlockPos.containing(entityiterator.getX() - 0.125, entityiterator.getY(), entityiterator.getZ()))).is(BlockTags.create(new ResourceLocation("electronics:conveyors")))) {
							slot = 0;
							for (int index3 = 0; index3 < (int) new Object() {
								public int getContainerSize(LevelAccessor world, BlockPos pos) {
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null) {
										if (_ent instanceof BaseContainerBlockEntity _block) {
											return _block.getContainerSize();
										}
									}
									return 0;
								}

								public int getAmount(LevelAccessor world, BlockPos pos) {
									Block block = world.getBlockState(pos).getBlock();
									if (block == Blocks.CHEST || block == Blocks.TRAPPED_CHEST) {
										boolean isSingle = block.getStateDefinition().getProperty("type") instanceof EnumProperty _getep5 && world.getBlockState(pos).getValue(_getep5).toString().equals("SINGLE");
										if (!isSingle) {
											return getContainerSize(world, pos) * 2;
										}
									}
									return getContainerSize(world, pos);
								}
							}.getAmount(world, new BlockPos((int) (entityiterator.getX() - 0.125), (int) (entityiterator.getY()), (int) (entityiterator.getZ()))); index3++) {
								if (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(entityiterator.getX() - 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot) == 0 || new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(entityiterator.getX() - 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot) != 0
										&& (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(entityiterator.getX() - 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot)).getItem()) {
									if (!entityiterator.level.isClientSide())
										entityiterator.discard();
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(entityiterator.getX() - 0.125, entityiterator.getY(), entityiterator.getZ()));
										if (_ent != null) {
											final int _slotid = (int) slot;
											final ItemStack _setstack = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
											_setstack.setCount((int) (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, BlockPos.containing(entityiterator.getX() - 0.125, entityiterator.getY(), entityiterator.getZ()), (int) slot) + 1));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
									break;
								}
								slot = slot + 1;
							}
						}
					}
				}
			}
		}
	}
}

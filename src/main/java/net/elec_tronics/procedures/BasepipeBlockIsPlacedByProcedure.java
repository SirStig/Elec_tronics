package net.elec_tronics.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.elec_tronics.init.ElecTronicsModBlocks;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

public class BasepipeBlockIsPlacedByProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double number_of_con = 0;double block = 0;
number_of_con = 0;if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x-1,y,z))) {number_of_con = number_of_con+1;}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x+1,y,z))) {number_of_con = number_of_con+1;}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y+1,z))) {number_of_con = number_of_con+1;}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y-1,z))) {number_of_con = number_of_con+1;}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y,z+1))) {number_of_con = number_of_con+1;}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y,z-1))) {number_of_con = number_of_con+1;}if (number_of_con==0) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.BASEPIPE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 0);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (number_of_con==1) {if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y,z-1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEHALF.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 1);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEHALF.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 1);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x-1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEHALF.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 1);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEHALF.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 1);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEHALF.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.UP;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 1);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEHALF.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.DOWN;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 1);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}}if (number_of_con==2) {if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPESTRAIGHT.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 2);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPESTRAIGHT.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 2);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))||new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canExtract()));
return _retval.get();
}
}.canExtractEnergy(world, BlockPos.containing(y,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPESTRAIGHT.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.DOWN;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 2);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", 3);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLEDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLEDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLEDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANGLEDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANLGEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANLGEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANLGEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEANLGEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}}if (number_of_con==3) {if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPET.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPET.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPET.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPET.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPET.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPETDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPETDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEDOWNANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEDOWNANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEDOWNANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEDOWNANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUPANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUPANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUPANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUPANGLE.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPETDOWNANDUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPETDOWNANDUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPETDOWNANDUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}}if (number_of_con==4) {if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTION.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}}if (number_of_con==4) {if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTION.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWNSTRAIGHT.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}}if (number_of_con==5) {if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONDOWN_2.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUP_2.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONMAIN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.EAST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONMAIN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.WEST;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x+1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONMAIN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.SOUTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}if (new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x-1,y,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y-1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y+1,z))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z-1))&&new Object(){
public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
AtomicBoolean _retval = new AtomicBoolean(false);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability ->
_retval.set(capability.canReceive()));
return _retval.get();
}
}.canReceiveEnergy(world, BlockPos.containing(x,y,z+1))) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONMAIN.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
{
Direction _dir = Direction.NORTH;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
} else {
_property = _bs.getBlock().getStateDefinition().getProperty("axis");
if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
}
}}}if (number_of_con==6) {{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ElecTronicsModBlocks.PIPEJUNCTIONUPANDDOWN_2.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
}if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putBoolean("blockStateChanged", false);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}block = 0;for (int index0 = 0; index0<21; index0++) {if ((world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == ) {if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("blockState", block);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}break;}block = block+1;}
}
}

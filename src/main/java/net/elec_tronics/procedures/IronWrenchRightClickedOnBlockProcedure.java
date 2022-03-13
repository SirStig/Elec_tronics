package net.elec_tronics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class IronWrenchRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double state = 0;
		if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:wires"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) == true
				|| BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:pipes"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) == true) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "blockState") < 20) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("blockState", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "blockState") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("blockState", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("blockStateChanged", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

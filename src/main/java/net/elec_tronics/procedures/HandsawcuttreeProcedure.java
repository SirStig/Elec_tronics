package net.elec_tronics.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class HandsawcuttreeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		for (int index0 = 0; index0 < 6; index0++) {
			sz = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sy = -12;
				for (int index2 = 0; index2 < 24; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("logs")))) {
						if (itemstack.getDamageValue() > 1) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							{
								BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
								world.destroyBlock(_pos, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("leaves")))) {
						if (itemstack.getDamageValue() > 1) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt((int) 0.25, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							world.destroyBlock(BlockPos.containing(x + sx, y + sy, z + sz), false);
						}
					}
					sy = sy + 1;
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
	}
}

package net.elec_tronics.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class HandsawcuttreeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sz = -3;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sy = -12;
				for (int index2 = 0; index2 < (int) (24); index2++) {
					if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("logs"))
							.contains((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock())) {
						if ((itemstack).getDamageValue() > 1) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if (world instanceof Level) {
								Block.dropResources(world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))), (Level) world,
										new BlockPos((int) x, (int) y, (int) z));
								world.destroyBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), false);
							}
						}
					} else if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("leaves"))
							.contains((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock())) {
						if ((itemstack).getDamageValue() > 1) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt((int) 0.25, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							world.destroyBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)), false);
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

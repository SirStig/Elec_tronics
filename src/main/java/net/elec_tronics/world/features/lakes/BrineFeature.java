
package net.elec_tronics.world.features.lakes;

import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;

import net.elec_tronics.procedures.BrineAdditionalGenerationConditionProcedure;
import net.elec_tronics.init.ElecTronicsModBlocks;

import java.util.Set;

public class BrineFeature extends LakeFeature {
	public static final BrineFeature FEATURE = (BrineFeature) new BrineFeature().setRegistryName("elec_tronics:brine");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new BlockStateConfiguration(ElecTronicsModBlocks.BRINE.defaultBlockState()))
			.rangeUniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0)).squared().rarity(5);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public BrineFeature() {
		super(BlockStateConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockStateConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!BrineAdditionalGenerationConditionProcedure.execute(y))
			return false;
		return super.place(context);
	}
}

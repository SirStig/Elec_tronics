
package net.elec_tronics.world.features.ores;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import net.elec_tronics.procedures.RockSaltAdditionalGenerationConditionProcedure;

import java.util.Set;

public class RockSaltFeature extends OreFeature {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public RockSaltFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!RockSaltAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}

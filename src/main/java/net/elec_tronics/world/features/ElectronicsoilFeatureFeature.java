
package net.elec_tronics.world.features;

import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import net.elec_tronics.procedures.ElectronicsoilAdditionalGenerationConditionProcedure;

import java.util.Set;

public class ElectronicsoilFeatureFeature extends LakeFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

	public ElectronicsoilFeatureFeature() {
		super(LakeFeature.Configuration.CODEC);
	}

	public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!ElectronicsoilAdditionalGenerationConditionProcedure.execute(y))
			return false;
		return super.place(context);
	}
}

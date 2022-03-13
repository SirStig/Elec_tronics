
package net.elec_tronics.world.features.ores;

public class BauxiteOreFeature extends OreFeature {

	public static final BauxiteOreFeature FEATURE = (BauxiteOreFeature) new BauxiteOreFeature().setRegistryName("elec_tronics:bauxite_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(BauxiteOreFeatureRuleTest.INSTANCE, ElecTronicsModBlocks.BAUXITE_ORE.defaultBlockState(), 5))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)))).squared().count(8);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public BauxiteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class BauxiteOreFeatureRuleTest extends RuleTest {

		static final BauxiteOreFeatureRuleTest INSTANCE = new BauxiteOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<BauxiteOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<BauxiteOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("elec_tronics:bauxite_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}

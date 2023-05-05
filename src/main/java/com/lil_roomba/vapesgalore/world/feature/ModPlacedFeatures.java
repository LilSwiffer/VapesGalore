package com.lil_roomba.vapesgalore.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> SMALL_MARIJUANA_PLANT_PLACED = PlacementUtils.register("small_marijuana_plant_placed",
            ModConfiguredFeatures.SMALL_MARIJUANA_PLANT, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> PLASTIC_BLOCK_PLACED = PlacementUtils.register("plastic_block_placed",
            ModConfiguredFeatures.PLASTIC_BLOCK, ModOrePlacement.commonOrePlacement(50,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}

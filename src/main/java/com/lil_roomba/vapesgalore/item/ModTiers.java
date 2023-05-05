package com.lil_roomba.vapesgalore.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTiers {
    public static final ForgeTier STRAWBERRY_JUUL = new ForgeTier(0, 1000, 1.5f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.STRAWBERRY_JUUL.get()));

    public static final ForgeTier BANANA_JUUL = new ForgeTier(0, 1000, 1.5f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BANANA_JUUL.get()));

    public static final ForgeTier LIME_JUUL = new ForgeTier(0, 1000, 1.5f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.LIME_JUUL.get()));

    public static final ForgeTier BUBBLEGUM_JUUL = new ForgeTier(0, 1000, 1.5f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BUBBLEGUM_JUUL.get()));

    public static final ForgeTier BLUEBERRY_JUUL = new ForgeTier(0, 1000, 1.5f,
            0f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BLUEBERRY_JUUL.get()));
}

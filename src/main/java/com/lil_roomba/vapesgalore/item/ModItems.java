package com.lil_roomba.vapesgalore.item;

import com.lil_roomba.vapesgalore.VapesGalore;
import com.lil_roomba.vapesgalore.block.ModBlocks;
import com.lil_roomba.vapesgalore.fluid.ModFluids;
import com.lil_roomba.vapesgalore.item.custom.JuulItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VapesGalore.MOD_ID);

    public static final RegistryObject<Item> JUUL_BATTERY = ITEMS.register("juul_battery",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> COIL = ITEMS.register("coil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> BATTERY = ITEMS.register("battery",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> STRAWBERRY_POD = ITEMS.register("strawberry_pod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> BANANA_POD = ITEMS.register("banana_pod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> LIME_POD = ITEMS.register("lime_pod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> BUBBLEGUM_POD = ITEMS.register("bubblegum_pod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> BLUEBERRY_POD = ITEMS.register("blueberry_pod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> BLUEBERRY_JUUL = ITEMS.register("blueberry_juul",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> STRAWBERRY_JUUL = ITEMS.register("strawberry_juul",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));


    public static final RegistryObject<Item> BANANA_JUUL = ITEMS.register("banana_juul",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));


    public static final RegistryObject<Item> LIME_JUUL = ITEMS.register("lime_juul",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));


    public static final RegistryObject<Item> BUBBLEGUM_JUUL = ITEMS.register("bubblegum_juul",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> BUD = ITEMS.register("bud",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static final RegistryObject<Item> CRUSHED_BUD = ITEMS.register("crushed_bud",
            () -> new Item(new JuulItem.Properties().tab(ModCreativeModeTab.VAPESGALORE)));


    public static final RegistryObject<Item> VAPE_JUICE_BUCKET = ITEMS.register("vape_juice_bucket",
            () -> new BucketItem(ModFluids.VAPE_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE).stacksTo(1)));

    public static final RegistryObject<Item> WEED_SEEDS = ITEMS.register("weed_seeds",
            () -> new ItemNameBlockItem(ModBlocks.WEED_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.VAPESGALORE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

package com.lil_roomba.vapesgalore.block;

import com.lil_roomba.vapesgalore.VapesGalore;
import com.lil_roomba.vapesgalore.block.custom.WeedGrinderBlock;
import com.lil_roomba.vapesgalore.item.ModItems;
import com.lil_roomba.vapesgalore.block.custom.WeedPlantBlock;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.intellij.lang.annotations.Flow;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, VapesGalore.MOD_ID);

    public static final RegistryObject<Block> PLASTIC_BLOCK = registerBlock("plastic_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> WEED_GRINDER = registerBlock("weed_grinder",
            () -> new WeedGrinderBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()
                    .strength(4f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> WEED_PLANT = registerBlockWithoutBlockItem("weed_plant",
            () -> new WeedPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> SMALL_MARIJUANA_PLANT = registerBlockWithoutBlockItem("small_marijuana_plant",
            () -> new FlowerBlock(MobEffects.HUNGER, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package com.lil_roomba.vapesgalore.block.entity;

import com.lil_roomba.vapesgalore.VapesGalore;
import com.lil_roomba.vapesgalore.block.ModBlocks;
import com.lil_roomba.vapesgalore.block.entity.custom.WeedGrinderBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, VapesGalore.MOD_ID);

    public static final RegistryObject<BlockEntityType<WeedGrinderBlockEntity>> WEED_GRINDER_ENTITY =
            BLOCK_ENTITIES.register("weed_grinder_block_entity", () ->
                    BlockEntityType.Builder.of(WeedGrinderBlockEntity::new,
                            ModBlocks.WEED_GRINDER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}

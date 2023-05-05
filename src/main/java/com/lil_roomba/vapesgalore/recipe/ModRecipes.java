package com.lil_roomba.vapesgalore.recipe;

import com.lil_roomba.vapesgalore.VapesGalore;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, VapesGalore.MOD_ID);

    public static final RegistryObject<RecipeSerializer<WeedGrinderRecipe>> BUD_CRUSHING_SERIALIZER =
            SERIALIZERS.register("bud_crushing", () -> WeedGrinderRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }


}

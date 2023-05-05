package com.lil_roomba.vapesgalore.world;

import com.lil_roomba.vapesgalore.VapesGalore;
import com.lil_roomba.vapesgalore.world.gen.ModFlowerGeneration;
import com.lil_roomba.vapesgalore.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VapesGalore.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModFlowerGeneration.generateFlowers(event);

    }
}
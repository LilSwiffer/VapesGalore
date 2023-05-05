package com.lil_roomba.vapesgalore;
import com.lil_roomba.vapesgalore.block.ModBlocks;
import com.lil_roomba.vapesgalore.block.entity.ModBlockEntities;
import com.lil_roomba.vapesgalore.fluid.ModFluids;
import com.lil_roomba.vapesgalore.item.ModItems;
import com.lil_roomba.vapesgalore.recipe.ModRecipes;
import com.lil_roomba.vapesgalore.screen.ModMenuTypes;
import com.lil_roomba.vapesgalore.screen.WeedGrinderScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VapesGalore.MOD_ID)
public class VapesGalore {
    public static final String MOD_ID = "vapesgalore";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogManager.getLogger();

    public VapesGalore() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModFluids.register(eventBus);

        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this :: clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.VAPE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.VAPE_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.VAPE_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEED_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_MARIJUANA_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEED_GRINDER.get(), RenderType.translucent());

        MenuScreens.register(ModMenuTypes.WEED_GRINDER_MENU.get(), WeedGrinderScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}

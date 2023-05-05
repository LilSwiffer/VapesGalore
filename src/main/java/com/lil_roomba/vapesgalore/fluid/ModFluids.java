package com.lil_roomba.vapesgalore.fluid;

import com.lil_roomba.vapesgalore.VapesGalore;
import com.lil_roomba.vapesgalore.block.ModBlocks;
import com.lil_roomba.vapesgalore.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, VapesGalore.MOD_ID);

    public static final RegistryObject<FlowingFluid> VAPE_FLUID
            = FLUIDS.register("vape_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.VAPE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> VAPE_FLOWING
            = FLUIDS.register("vape_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.VAPE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties VAPE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> VAPE_FLUID.get(), () -> VAPE_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xbffcba03)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.VAPE_BLOCK.get()).bucket(() -> ModItems.VAPE_JUICE_BUCKET.get());

    public static final RegistryObject<LiquidBlock> VAPE_BLOCK = ModBlocks.BLOCKS.register("vape_block",
            () -> new LiquidBlock(() -> ModFluids.VAPE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
package com.lil_roomba.vapesgalore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VAPESGALORE = new CreativeModeTab("vapesgalore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STRAWBERRY_JUUL.get());
        }
    };
}

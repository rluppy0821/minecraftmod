package com.tntmodders.titaniummod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(TitaniumMod.MOD_ID)
public class TitaniumMod {
    public static final String MOD_ID = "titaniummod";

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEventSubscriber {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(Items.TITANIUM_INGOT);
        }
    }

    public static class Items {
        public static final Item TITANIUM_INGOT = new Item(new Item.Properties()
                .group(ItemGroup.MATERIALS))
                .setRegistryName("titanium_ingot");
    }
}
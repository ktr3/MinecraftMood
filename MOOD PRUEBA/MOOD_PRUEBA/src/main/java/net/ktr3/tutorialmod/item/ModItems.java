package net.ktr3.tutorialmod.item;

import net.ktr3.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraft.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> KTR3ROCKS =
            ITEMS.register("ktr3rocks",
                    () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }
}

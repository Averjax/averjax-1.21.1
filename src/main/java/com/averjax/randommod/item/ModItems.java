package com.averjax.randommod.item;

import com.averjax.randommod.Averjax;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// Adding an Item Add a line to ModItems> registerModItems>lang>models.item > textures.item??

public class ModItems {
    public static final Item AVERJAX_ITEM = registerItem("averjax_item", new Item(new Item.Settings()));
    public static final Item AVERJAX_ITEMM = registerItem("averjax_itemm", new Item(new Item.Settings()));

    private  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Averjax.MOD_ID, name), item);

    }


    public static void registerModItems(){
        Averjax.LOGGER.info("Registering Mod Items: "+ Averjax.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(AVERJAX_ITEM);
           entries.add(AVERJAX_ITEMM);
        });
    }
}

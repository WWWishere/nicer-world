package net.lolagain.nicerworld.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lolagain.nicerworld.NicerWorld;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NodItems {

    public static final Item CHRYSOPRASE = registerItem("chrysoprase",
            new Item(new FabricItemSettings()));
    public static final Item RHULITE = registerItem("rhulite",
            new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MYSTSTONE_BAR = registerItem("myststone_bar",
            new Item(new FabricItemSettings()));

    private static void addItemsToCreativeModeTab(FabricItemGroupEntries entries) {
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NicerWorld.MOD_ID, name), item);
    }
    public static void registerModItems() {
        NicerWorld.LOGGER.info("Registering Mod Items for " + NicerWorld.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(NodItems::addItemsToCreativeModeTab);
    }
}

package net.lolagain.nicerworld.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lolagain.nicerworld.NicerWorld;
import net.minecraft.item.*;
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
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item LUNIUM_INGOT = registerItem("lunium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NATURIUM_INGOT = registerItem("naturium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item CHRYSOPRASE_SWORD = registerItem("chrysoprase_sword",
            new SwordItem(NodToolMaterial.CHRYSOPRASE, 3, -2.4f,
                    new FabricItemSettings()));
    public static final Item RHULITE_SWORD = registerItem("rhulite_sword",
            new SwordItem(NodToolMaterial.RHULITE, 3, -2.4f,
                    new FabricItemSettings()));
    public static final Item ELECTRUM_SWORD = registerItem("electrum_sword",
            new SwordItem(NodToolMaterial.ELECTRUM, 3, -2.0f,
                    new FabricItemSettings()));
    public static final Item MYSTSTONE_SWORD = registerItem("myststone_sword",
            new SwordItem(NodToolMaterial.MYSTSTONE, 3, -2.4f,
                    new FabricItemSettings()));
    public static final Item CHRYSOPRASE_PICKAXE = registerItem("chrysoprase_pickaxe",
            new PickaxeItem(NodToolMaterial.CHRYSOPRASE, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item RHULITE_PICKAXE = registerItem("rhulite_pickaxe",
            new PickaxeItem(NodToolMaterial.RHULITE, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item ELECTRUM_PICKAXE = registerItem("electrum_pickaxe",
            new PickaxeItem(NodToolMaterial.ELECTRUM, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item MYSTSTONE_PICKAXE = registerItem("myststone_pickaxe",
            new PickaxeItem(NodToolMaterial.MYSTSTONE, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item CHRYSOPRASE_AXE = registerItem("chrysoprase_axe",
            new AxeItem(NodToolMaterial.CHRYSOPRASE, 5, -3f,
                    new FabricItemSettings()));
    public static final Item RHULITE_AXE = registerItem("rhulite_axe",
            new AxeItem(NodToolMaterial.RHULITE, 5, -3f,
                    new FabricItemSettings()));
    public static final Item ELECTRUM_AXE = registerItem("electrum_axe",
            new AxeItem(NodToolMaterial.ELECTRUM, 5, -3f,
                    new FabricItemSettings()));
    public static final Item MYSTSTONE_AXE = registerItem("myststone_axe",
            new AxeItem(NodToolMaterial.MYSTSTONE, 5, -2.9f,
                    new FabricItemSettings()));
    public static final Item CHRYSOPRASE_SHOVEL = registerItem("chrysoprase_shovel",
            new ShovelItem(NodToolMaterial.CHRYSOPRASE, 1.5f, -3f,
                    new FabricItemSettings()));
    public static final Item RHULITE_SHOVEL = registerItem("rhulite_shovel",
            new ShovelItem(NodToolMaterial.RHULITE, 1.5f, -3f,
                    new FabricItemSettings()));
    public static final Item ELECTRUM_SHOVEL = registerItem("electrum_shovel",
            new ShovelItem(NodToolMaterial.ELECTRUM, 1.5f, -3f,
                    new FabricItemSettings()));
    public static final Item MYSTSTONE_SHOVEL = registerItem("myststone_shovel",
            new ShovelItem(NodToolMaterial.MYSTSTONE, 1.5f, -3f,
                    new FabricItemSettings()));
    public static final Item CHRYSOPRASE_HOE = registerItem("chrysoprase_hoe",
            new ShovelItem(NodToolMaterial.CHRYSOPRASE, -5, 1f,
                    new FabricItemSettings()));
    public static final Item RHULITE_HOE = registerItem("rhulite_hoe",
            new ShovelItem(NodToolMaterial.RHULITE, -6, 1f,
                    new FabricItemSettings()));
    public static final Item ELECTRUM_HOE = registerItem("electrum_hoe",
            new ShovelItem(NodToolMaterial.ELECTRUM, -2, 0f,
                    new FabricItemSettings()));
    public static final Item MYSTSTONE_HOE = registerItem("myststone_hoe",
            new ShovelItem(NodToolMaterial.MYSTSTONE, -6.5f, 2f,
                    new FabricItemSettings()));

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

package net.lolagain.nicerworld.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lolagain.nicerworld.NicerWorld;
import net.lolagain.nicerworld.block.NodBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class NodItemGroups {
    public static final ItemGroup BASE_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NicerWorld.MOD_ID, "base_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.base_blocks"))
                    .icon(() -> new ItemStack(NodBlocks.CHRYSOPRASE_ORE)).entries(((displayContext, entries) -> {
                        // entries.add(NodBlocks.);
                        entries.add(NodBlocks.CHRYSOPRASE_ORE);
                        entries.add(NodBlocks.RHULITE_ORE);
                        entries.add(NodBlocks.DEEPSLATE_CHRYSOPRASE_ORE);
                        entries.add(NodBlocks.DEEPSLATE_RHULITE_ORE);
                        entries.add(NodBlocks.CHRYSOPRASE_BLOCK);
                        entries.add(NodBlocks.RHULITE_BLOCK);
                        entries.add(NodBlocks.ELECTRUM_BLOCK);
                        entries.add(NodBlocks.MYSTSTONE_BLOCK);
                        entries.add(NodBlocks.BLUE_MOSS);
                        entries.add(NodBlocks.BLUE_MOSS_BLOCK);
                        entries.add(NodBlocks.DEEPSLATE_BLUE_MOSS);
                        entries.add(NodBlocks.STONE_MYCELIUM);
                        entries.add(NodBlocks.DEEPSLATE_MYCELIUM);
                        entries.add(NodBlocks.MOSSED_STONE);
                        entries.add(NodBlocks.MOSSED_DEEPSLATE);
                        entries.add(NodBlocks.WATER_STEAMER);
                        entries.add(NodBlocks.DEEP_WATER_STEAMER);
                        entries.add(NodBlocks.QUARTZ_CRYSTAL);
                        entries.add(NodBlocks.AMETHYST_CRYSTAL);
                        entries.add(NodBlocks.CHRYSOPRASE_CRYSTAL);
                    })).build());
    public static final ItemGroup VARIATIONAL_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NicerWorld.MOD_ID, "var_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.var_blocks"))
                    .icon(() -> new ItemStack(NodBlocks.MINI_OAK)).entries(((displayContext, entries) -> {
                        // entries.add(NodBlocks.);
                        entries.add(NodBlocks.MINI_OAK);
                        entries.add(NodBlocks.REDUCED_OAK_SAPLING);
                        entries.add(NodBlocks.LARGE_PUMPKIN);
                        entries.add(NodBlocks.SLIME_FLOWER);
                    })).build());
    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NicerWorld.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items"))
                    .icon(() -> new ItemStack(NodItems.CHRYSOPRASE)).entries(((displayContext, entries) -> {
                        // entries.add(NodItems.);
                        entries.add(NodItems.CHRYSOPRASE);
                        entries.add(NodItems.RHULITE);
                        entries.add(NodItems.ELECTRUM_INGOT);
                        entries.add(NodItems.MYSTSTONE_BAR);
                        entries.add(NodItems.STEEL_INGOT);
                        entries.add(NodItems.LUNIUM_INGOT);
                        entries.add(NodItems.NATURIUM_INGOT);
                        entries.add(NodItems.CHRYSOPRASE_SWORD);
                        entries.add(NodItems.CHRYSOPRASE_PICKAXE);
                        entries.add(NodItems.CHRYSOPRASE_AXE);
                        entries.add(NodItems.CHRYSOPRASE_SHOVEL);
                        entries.add(NodItems.CHRYSOPRASE_HOE);
                        entries.add(NodItems.RHULITE_SWORD);
                        entries.add(NodItems.RHULITE_PICKAXE);
                        entries.add(NodItems.RHULITE_AXE);
                        entries.add(NodItems.RHULITE_SHOVEL);
                        entries.add(NodItems.RHULITE_HOE);
                        entries.add(NodItems.ELECTRUM_SWORD);
                        entries.add(NodItems.ELECTRUM_PICKAXE);
                        entries.add(NodItems.ELECTRUM_AXE);
                        entries.add(NodItems.ELECTRUM_SHOVEL);
                        entries.add(NodItems.ELECTRUM_HOE);
                        entries.add(NodItems.MYSTSTONE_SWORD);
                        entries.add(NodItems.MYSTSTONE_PICKAXE);
                        entries.add(NodItems.MYSTSTONE_AXE);
                        entries.add(NodItems.MYSTSTONE_SHOVEL);
                        entries.add(NodItems.MYSTSTONE_HOE);
                    })).build());
    public static void registerItemGroups() {
        NicerWorld.LOGGER.info("Registering Item Groups for " + NicerWorld.MOD_ID);
    }
}

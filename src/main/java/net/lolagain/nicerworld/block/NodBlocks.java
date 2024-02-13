package net.lolagain.nicerworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lolagain.nicerworld.NicerWorld;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NodBlocks {
    public static final Block CHRYSOPRASE_ORE = registerBlock("chrysoprase_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3f).resistance(12f)));
    public static final Block RHULITE_ORE = registerBlock("rhulite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3f).resistance(50f)));

    public static final Block CHRYSOPRASE_BLOCK = registerBlock("chrysoprase_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(12f)));
    public static final Block RHULITE_BLOCK = registerBlock("rhulite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(50f)));
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(6f)));
    public static final Block MYSTSTONE_BLOCK = registerBlock("chrysoprase_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(100f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NicerWorld.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NicerWorld.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        NicerWorld.LOGGER.info("Registering Mod Blocks for " + NicerWorld.MOD_ID);
    }
}

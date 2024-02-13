package net.lolagain.nicerworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lolagain.nicerworld.NicerWorld;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class NodBlocks {
    public static final Block CHRYSOPRASE_ORE = registerBlock("chrysoprase_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 10), FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3f).resistance(1200f)));
    public static final Block RHULITE_ORE = registerBlock("rhulite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 12), FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3f).resistance(5000f)));
    public static final Block DEEPSLATE_CHRYSOPRASE_ORE = registerBlock("deepslate_chrysoprase_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 10), FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(4.5f).resistance(1200f)));
    public static final Block DEEPSLATE_RHULITE_ORE = registerBlock("deepslate_rhulite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 12), FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(4.5f).resistance(5000f)));

    public static final Block CHRYSOPRASE_BLOCK = registerBlock("chrysoprase_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(1200f)));
    public static final Block RHULITE_BLOCK = registerBlock("rhulite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(5000f)));
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(6f)));
    public static final Block MYSTSTONE_BLOCK = registerBlock("myststone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()
                    .hardness(5f).resistance(10000f)));

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

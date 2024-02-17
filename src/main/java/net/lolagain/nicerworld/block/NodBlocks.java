package net.lolagain.nicerworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lolagain.nicerworld.NicerWorld;
import net.lolagain.nicerworld.block.custom.SteamerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
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
    public static final Block BLUE_MOSS = registerBlock("blue_moss",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(2f).resistance(5f).sounds(BlockSoundGroup.MOSS_BLOCK)));
    public static final Block DEEPSLATE_BLUE_MOSS = registerBlock("deepslate_blue_moss",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3.5f).resistance(5f).sounds(BlockSoundGroup.MOSS_BLOCK)));
    public static final Block BLUE_MOSS_BLOCK = registerBlock("blue_moss_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)
                    .hardness(0.1f).resistance(0.1f)));
    public static final Block STONE_MYCELIUM = registerBlock("stone_mycelium",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(2f).resistance(5f).sounds(BlockSoundGroup.GRASS)));
    public static final Block DEEPSLATE_MYCELIUM = registerBlock("deepslate_mycelium",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3.5f).resistance(5f).sounds(BlockSoundGroup.GRASS)));
    public static final Block MOSSED_STONE = registerBlock("mossed_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(2f).resistance(5f).sounds(BlockSoundGroup.MOSS_BLOCK)));
    public static final Block MOSSED_DEEPSLATE = registerBlock("mossed_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3.5f).resistance(5f).sounds(BlockSoundGroup.MOSS_BLOCK)));
    public static final Block WATER_STEAMER = registerBlock("water_steamer",
            new SteamerBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(1.5f).resistance(6f)));
    public static final Block DEEP_WATER_STEAMER = registerBlock("deep_water_steamer",
            new SteamerBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(3f).resistance(6f)));
    public static final Block QUARTZ_CRYSTAL = registerBlock("quartz_crystal",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(1f).resistance(3f)));
    public static final Block AMETHYST_CRYSTAL = registerBlock("amethyst_crystal",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(1f).resistance(3f)));
    public static final Block CHRYSOPRASE_CRYSTAL = registerBlock("chrysoprase_crystal",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()
                    .hardness(1f).resistance(1200f)));

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
    // Outside of Base Blocks
    public static final Block MINI_OAK = registerBlock("mini_oak",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                    .hardness(4f).resistance(2f)));
    public static final Block REDUCED_OAK_SAPLING = registerBlock("reduced_oak_sapling",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                    .hardness(4f).resistance(2f)));
    public static final Block LARGE_PUMPKIN = registerBlock("large_pumpkin",
            new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN)
                    .hardness(4f).resistance(2f)));
    public static final Block SLIME_FLOWER = registerBlock("slime_flower",
            new Block(FabricBlockSettings.copyOf(Blocks.ALLIUM)
                    .hardness(0f).resistance(0f)));

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

package net.lolagain.nicerworld.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lolagain.nicerworld.block.NodBlocks;
import net.lolagain.nicerworld.item.NodItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(NodBlocks.CHRYSOPRASE_BLOCK);
        addDrop(NodBlocks.RHULITE_BLOCK);
        addDrop(NodBlocks.ELECTRUM_BLOCK);
        addDrop(NodBlocks.MYSTSTONE_BLOCK);
        addDrop(NodBlocks.MYSTSTONE_BLOCK);
        addDrop(NodBlocks.BLUE_MOSS_BLOCK);
        addDrop(NodBlocks.WATER_STEAMER);
        addDrop(NodBlocks.DEEP_WATER_STEAMER);
        addDrop(NodBlocks.QUARTZ_CRYSTAL);
        addDrop(NodBlocks.AMETHYST_CRYSTAL);
        addDrop(NodBlocks.CHRYSOPRASE_CRYSTAL);
        addDrop(NodBlocks.REDUCED_OAK_SAPLING);
        // Temporary
        addDrop(NodBlocks.MINI_OAK);
        addDrop(NodBlocks.SLIME_FLOWER);

        addDrop(NodBlocks.BLUE_MOSS, Blocks.STONE);
        addDrop(NodBlocks.DEEPSLATE_BLUE_MOSS, Blocks.DEEPSLATE);
        addDrop(NodBlocks.STONE_MYCELIUM, Blocks.STONE);
        addDrop(NodBlocks.DEEPSLATE_MYCELIUM, Blocks.DEEPSLATE);
        addDrop(NodBlocks.MOSSED_STONE, Blocks.STONE);
        addDrop(NodBlocks.MOSSED_DEEPSLATE, Blocks.DEEPSLATE);
        addMultiDrops(NodBlocks.LARGE_PUMPKIN, Blocks.PUMPKIN, 4f);

        addOreDrops(NodBlocks.CHRYSOPRASE_ORE, NodItems.CHRYSOPRASE);
        addOreDrops(NodBlocks.RHULITE_ORE, NodItems.RHULITE);
        addOreDrops(NodBlocks.DEEPSLATE_CHRYSOPRASE_ORE, NodItems.CHRYSOPRASE);
        addOreDrops(NodBlocks.DEEPSLATE_RHULITE_ORE, NodItems.RHULITE);
    }

    private void addOreDrops(Block block, Item item) {
        addDrop(block, oreDrops(block, item));
    }
    private LootTable.Builder multiOreDrops(Block drop, Item item, Float min, Float max) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
    private LootTable.Builder multiOreDrops(Block drop, Item item, Float count) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(count)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
    private LootTable.Builder addMultiDrops(Block block, ItemConvertible item, Float count) {
        return BlockLootTableGenerator.dropsWithSilkTouch(block, (LootPoolEntry.Builder)this.applyExplosionDecay(block, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(count))))));
    }
}

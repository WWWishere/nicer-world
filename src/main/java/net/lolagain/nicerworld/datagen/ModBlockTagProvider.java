package net.lolagain.nicerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lolagain.nicerworld.block.NodBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(NodBlocks.CHRYSOPRASE_BLOCK)
                .add(NodBlocks.CHRYSOPRASE_ORE)
                .add(NodBlocks.DEEPSLATE_CHRYSOPRASE_ORE)
                .add(NodBlocks.RHULITE_BLOCK)
                .add(NodBlocks.RHULITE_ORE)
                .add(NodBlocks.DEEPSLATE_RHULITE_ORE)
                .add(NodBlocks.ELECTRUM_BLOCK)
                .add(NodBlocks.MYSTSTONE_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(NodBlocks.ELECTRUM_BLOCK);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(NodBlocks.CHRYSOPRASE_ORE)
                .add(NodBlocks.DEEPSLATE_CHRYSOPRASE_ORE)
                .add(NodBlocks.CHRYSOPRASE_BLOCK);
    }
}

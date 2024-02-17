package net.lolagain.nicerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lolagain.nicerworld.item.NodItems;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "ingots")))
                .add(NodItems.ELECTRUM_INGOT)
                .add(NodItems.LUNIUM_INGOT)
                .add(NodItems.NATURIUM_INGOT)
                .add(NodItems.STEEL_INGOT)
                .add(NodItems.MYSTSTONE_BAR);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "gems")))
                .add(NodItems.CHRYSOPRASE)
                .add(NodItems.RHULITE);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "steel_ingots")))
                .add(NodItems.STEEL_INGOT);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "electrum_ingots")))
                .add(NodItems.ELECTRUM_INGOT);
    }
}

package net.lolagain.nicerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lolagain.nicerworld.block.NodBlocks;
import net.lolagain.nicerworld.item.NodItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(NodBlocks.CHRYSOPRASE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(NodBlocks.RHULITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(NodBlocks.DEEPSLATE_CHRYSOPRASE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(NodBlocks.DEEPSLATE_RHULITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(NodItems.CHRYSOPRASE, Models.GENERATED);
        itemModelGenerator.register(NodItems.RHULITE, Models.GENERATED);
    }
}

package net.lolagain.nicerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lolagain.nicerworld.item.NodItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, NodItems.MYSTSTONE_BAR)
                .pattern("SSS")
                .pattern(" T ")
                .pattern("UUU")
                .input('S', Items.LAPIS_BLOCK)
                .input('T', Items.QUARTZ)
                .input('U', NodItems.RHULITE)
                .criterion(hasItem(NodItems.RHULITE), conditionsFromItem(NodItems.RHULITE))
                .offerTo(exporter);
    }
}

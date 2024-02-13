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
                    .icon(() -> new ItemStack(NodItems.CHRYSOPRASE)).entries(((displayContext, entries) -> {
                        entries.add(NodBlocks.CHRYSOPRASE_ORE);
                        entries.add(NodBlocks.RHULITE_ORE);
                        entries.add(NodBlocks.DEEPSLATE_CHRYSOPRASE_ORE);
                        entries.add(NodBlocks.DEEPSLATE_RHULITE_ORE);
                        entries.add(NodBlocks.CHRYSOPRASE_BLOCK);
                        entries.add(NodBlocks.RHULITE_BLOCK);
                        entries.add(NodBlocks.ELECTRUM_BLOCK);
                        entries.add(NodBlocks.MYSTSTONE_BLOCK);
                    })).build());
    public static final ItemGroup VARIATIONAL_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NicerWorld.MOD_ID, "var_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.var_blocks"))
                    .icon(() -> new ItemStack(NodItems.CHRYSOPRASE)).entries(((displayContext, entries) -> {

                    })).build());
    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NicerWorld.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items"))
                    .icon(() -> new ItemStack(NodItems.CHRYSOPRASE)).entries(((displayContext, entries) -> {
                        entries.add(NodItems.CHRYSOPRASE);
                        entries.add(NodItems.RHULITE);
                        entries.add(NodItems.ELECTRUM_INGOT);
                        entries.add(NodItems.MYSTSTONE_BAR);
                    })).build());
    public static void registerItemGroups() {
        NicerWorld.LOGGER.info("Registering Item Groups for " + NicerWorld.MOD_ID);
    }
}

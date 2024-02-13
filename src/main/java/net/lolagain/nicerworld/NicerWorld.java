package net.lolagain.nicerworld;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lolagain.nicerworld.block.NodBlocks;
import net.lolagain.nicerworld.item.NodItemGroups;
import net.lolagain.nicerworld.item.NodItems;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NicerWorld implements ModInitializer {
	public static final String MOD_ID = "nicerworld";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		NodItemGroups.registerItemGroups();
		NodItems.registerModItems();
		NodBlocks.registerModBlocks();
	}
}
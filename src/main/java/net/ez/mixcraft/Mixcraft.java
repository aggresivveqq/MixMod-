package net.ez.mixcraft;

import net.ez.mixcraft.items.ModItemGroups;
import net.ez.mixcraft.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mixcraft implements ModInitializer {
    public static final String MOD_ID ="mixcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
package net.maksymko.sliminator;

import net.fabricmc.api.ModInitializer;
import net.maksymko.sliminator.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sliminator implements ModInitializer {
	public static final String MOD_ID = "sliminator";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Initializing Sliminator");
	}
}
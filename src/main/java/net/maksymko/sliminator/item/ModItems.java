package net.maksymko.sliminator.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maksymko.sliminator.Sliminator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

  public static final Item CHUNK_DETECTOR = register(new ChunkDetector(new ChunkDetector.Settings()), "chunk_detector");
  
  public static Item register(Item item, String id) {
		Identifier itemID = Identifier.of(Sliminator.MOD_ID, id);
		Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

		return registeredItem;
	}

  public static void registerModItems() {
    Sliminator.LOGGER.info("Registering Mod Items for " + Sliminator.MOD_ID);


    ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
      entries.add(CHUNK_DETECTOR);
    });
  }
}

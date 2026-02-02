package net.maksymko.sliminator.item;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.maksymko.sliminator.util.Miscellaneous;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;


public class ChunkDetector extends Item {
  public ChunkDetector(Settings settings) {
    super(settings);
  }

  
  @Override
  public ActionResult useOnBlock(ItemUsageContext context) {
    var client = MinecraftClient.getInstance();
    var world  = context.getWorld();
    HudRenderCallback.EVENT.register(((drawContext, tickCounter) -> {
      if (Miscellaneous.isSlimeChunk(world, context.getBlockPos())) {
        drawContext.drawText(
          client.textRenderer,
          "Slime chunk is detected!", 
          drawContext.getScaledWindowWidth() / 2 - 50,
          drawContext.getScaledWindowHeight() / 2 - 100,
          0xffffff, 
          false
        );
      }
      else {
        drawContext.drawText(
          client.textRenderer,
          "No slime chunk detected.", 
          drawContext.getScaledWindowWidth() / 2 - 50,
          drawContext.getScaledWindowHeight() / 2 - 100,
          0xffffff, 
          false
        );
      }
      System.out.println("Is slime chunk: " + Miscellaneous.isSlimeChunk(world, context.getBlockPos()));
    }));
    return super.useOnBlock(context);
  }

}

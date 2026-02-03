package net.maksymko.sliminator.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.ChunkRandom;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.World;


public class Miscellaneous {
  public static final boolean isSlimeChunk(World world, BlockPos pos) {
    if (pos.getY() > 50) {
      return false;
    }
    System.out.println("breakpoint hit 1");
    var chunkPos = world.getChunk(pos).getPos();
    System.out.println("breakpoint hit 2");
    return ChunkRandom.getSlimeRandom(chunkPos.x, chunkPos.z, ((StructureWorldAccess)world).getSeed(), 987234911L).nextInt(10) == 0;
  }  
}
package net.maksymko.sliminator.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class Miscellaneous {
  public static final boolean isSlimeChunk(World world, BlockPos pos) {
    return SlimeEntity.canSpawn(EntityType.SLIME, world, SpawnReason.NATURAL, pos, world.getRandom());
  }  
}

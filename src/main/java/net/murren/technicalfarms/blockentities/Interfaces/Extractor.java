package net.murren.technicalfarms.blockentities.Interfaces;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public interface Extractor {
    VoxelShape ABOVE = Block.box(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
    static VoxelShape getSuckShape() { return ABOVE; }
}

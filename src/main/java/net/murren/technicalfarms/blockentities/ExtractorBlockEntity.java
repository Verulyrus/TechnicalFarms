package net.murren.technicalfarms.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.Hopper;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Iterator;

public class ExtractorBlockEntity extends HopperBlockEntity {

    public ExtractorBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }
    public static void pushItemsTick(Level level, BlockPos pos, BlockState state, HopperBlockEntity blockEntity) {
          suckInItems(level, blockEntity);
    }
    public static boolean suckInItems(Level level, Hopper hopper) {
        Iterator var3 = getItemsAtAndAbove(level, hopper).iterator();
        ItemEntity itemEntity;
        if (!var3.hasNext()) {
            return false;
        } else {
            itemEntity = (ItemEntity)var3.next();
            itemEntity.moveTo(itemEntity.position().x, itemEntity.position().y - 1.2f, itemEntity.position().z);
        }
        return true;
    }

}

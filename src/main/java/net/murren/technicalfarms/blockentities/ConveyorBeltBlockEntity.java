package net.murren.technicalfarms.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

import static net.murren.technicalfarms.registers.BlockEntityTypes.CONVEYOR;

public class ConveyorBeltBlockEntity extends BlockEntity {

    public ConveyorBeltBlockEntity(BlockPos pos, BlockState state) {
        super(CONVEYOR, pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state1, ConveyorBeltBlockEntity be) {
        List<ItemEntity> items = level.getEntitiesOfClass(ItemEntity.class, new AABB(pos.above()));

    }
}

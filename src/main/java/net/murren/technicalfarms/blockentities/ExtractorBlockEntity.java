package net.murren.technicalfarms.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.murren.technicalfarms.blockentities.Interfaces.Extractor;

import java.util.List;

import static net.murren.technicalfarms.registers.BlockEntityTypes.EXTRACTOR;

public class ExtractorBlockEntity extends BlockEntity implements Extractor {
    public ExtractorBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(EXTRACTOR, blockPos, blockState);
    }

    public static void tick(Level level, BlockPos pos, BlockState state1, ExtractorBlockEntity be) {
        List<ItemEntity> items = level.getEntitiesOfClass(ItemEntity.class, new AABB(pos.above()));
        items.forEach(item -> {
            item.moveTo(pos.below(), 0, 0);
        });
    }
}

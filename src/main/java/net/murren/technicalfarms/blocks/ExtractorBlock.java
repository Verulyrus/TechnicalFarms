package net.murren.technicalfarms.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import net.murren.technicalfarms.blockentities.ExtractorBlockEntity;
import org.jetbrains.annotations.Nullable;

import static net.murren.technicalfarms.registers.BlockEntityTypes.EXTRACTOR;

public class ExtractorBlock extends BaseEntityBlock implements EntityBlock {

    public ExtractorBlock(Properties properties) {
        super(properties);
    }
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ExtractorBlockEntity(pos, state);
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level world, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, EXTRACTOR, ExtractorBlockEntity::tick);
    }

    @Override
    public RenderShape getRenderShape(BlockState state){ return RenderShape.MODEL; }


}

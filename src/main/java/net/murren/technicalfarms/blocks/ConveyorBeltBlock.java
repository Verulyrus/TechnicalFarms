package net.murren.technicalfarms.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.murren.technicalfarms.blockentities.ConveyorBeltBlockEntity;
import org.jetbrains.annotations.Nullable;

import static net.murren.technicalfarms.registers.BlockEntityTypes.CONVEYOR;

public class ConveyorBeltBlock extends BaseEntityBlock implements EntityBlock {

    public ConveyorBeltBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }



    public static final DirectionProperty DIRECTION = DirectionProperty.create("direction", (direction) -> direction != Direction.UP);

    @Override
    protected void appendProperties(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(DIRECTION);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ConveyorBeltBlockEntity(pos, state);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level world, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, CONVEYOR, ConveyorBeltBlockEntity::tick);
    }

    @Override
    public RenderShape getRenderShape(BlockState state){ return RenderShape.MODEL; }
}

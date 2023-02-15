package net.murren.technicalfarms.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HopperBlock;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.murren.technicalfarms.blockentities.ExtractorBlockEntity;
import org.jetbrains.annotations.Nullable;

public class ExtractorBlock extends HopperBlock {
    private static final VoxelShape TOP;
    private static final VoxelShape FUNNEL;
    private static final VoxelShape CONVEX_BASE;
    private static final VoxelShape BASE;
    private static final VoxelShape DOWN_SHAPE;
    private static final VoxelShape DOWN_INTERACTION_SHAPE;
    static {
        TOP = Block.box(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
        FUNNEL = Block.box(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
        CONVEX_BASE = Shapes.or(FUNNEL, TOP);
        BASE = Shapes.join(CONVEX_BASE, Hopper.INSIDE, BooleanOp.ONLY_FIRST);
        DOWN_SHAPE = Shapes.or(BASE, Block.box(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
        DOWN_INTERACTION_SHAPE = Hopper.INSIDE;
    }

    public ExtractorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return DOWN_SHAPE;
    }
    @Override
    public VoxelShape getInteractionShape(BlockState state, BlockGetter level, BlockPos pos) {
        return DOWN_INTERACTION_SHAPE;
    }
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        return InteractionResult.PASS;
    }
    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return level.isClientSide ? null : createTickerHelper(blockEntityType, BlockEntityType.HOPPER, ExtractorBlockEntity::pushItemsTick);
    }
}

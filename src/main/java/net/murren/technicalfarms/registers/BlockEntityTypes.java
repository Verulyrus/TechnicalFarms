package net.murren.technicalfarms.registers;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.murren.technicalfarms.blockentities.ConveyorBeltBlockEntity;
import net.murren.technicalfarms.blockentities.ExtractorBlockEntity;

import static net.murren.technicalfarms.TechnicalFarmsMod.MOD_ID;
import static net.murren.technicalfarms.registers.BlockRegister.CONVEYOR_BLOCK;
import static net.murren.technicalfarms.registers.BlockRegister.EXTRACTOR_BLOCK;

public class BlockEntityTypes {
    public static final BlockEntityType<ExtractorBlockEntity> EXTRACTOR;
    public static final BlockEntityType<ConveyorBeltBlockEntity> CONVEYOR;

    static {
        EXTRACTOR = Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "extractor_block_entity"),
                FabricBlockEntityTypeBuilder.create(ExtractorBlockEntity::new, EXTRACTOR_BLOCK).build());
        CONVEYOR = Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "conveyor_block_entity"),
                FabricBlockEntityTypeBuilder.create(ConveyorBeltBlockEntity::new, CONVEYOR_BLOCK).build());
    }
}

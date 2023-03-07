package net.murren.technicalfarms.registers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.murren.technicalfarms.blocks.ConveyorBeltBlock;
import net.murren.technicalfarms.blocks.ExtractorBlock;

import static net.murren.technicalfarms.TechnicalFarmsMod.MOD_ID;

public class BlockRegister {
    public static final Block EXTRACTOR_BLOCK = registerBlock("extractor_block",
            new ExtractorBlock(FabricBlockSettings.of(Material.WOOD)));

    public static final Block CONVEYOR_BLOCK = registerBlock("conveyor_block",
            new ConveyorBeltBlock(FabricBlockSettings.of(Material.WOOD)));

    public static Block registerBlock(String name, Block block)
    {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static void registerBlocks() {}
}

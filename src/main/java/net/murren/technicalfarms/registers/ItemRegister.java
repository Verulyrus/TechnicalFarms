package net.murren.technicalfarms.registers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static net.murren.technicalfarms.TechnicalFarmsMod.MOD_ID;
import static net.murren.technicalfarms.registers.BlockRegister.EXTRACTOR_BLOCK;

public class ItemRegister {

    public static final Item EXTRACTOR_BLOCK_ITEM = registerBlockItem("extractor_block", new BlockItem(EXTRACTOR_BLOCK, new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), item);
    }
    private static Item registerBlockItem(String name, BlockItem item)
    {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), item);
    }
    public static void registerItems(){}
}

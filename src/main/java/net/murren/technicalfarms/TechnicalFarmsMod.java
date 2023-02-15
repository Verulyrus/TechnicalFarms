package net.murren.technicalfarms;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.murren.technicalfarms.registers.BlockRegister.registerBlocks;
import static net.murren.technicalfarms.registers.ItemRegister.registerItems;

public class TechnicalFarmsMod implements ModInitializer {
	public static final String MOD_ID = "technicalfarms";
	public static final Logger LOGGER = LoggerFactory.getLogger("technicalfarms");

	@Override
	public void onInitialize() {
		registerBlocks();
		registerItems();
		LOGGER.info("Hello Fabric world!");
	}
}
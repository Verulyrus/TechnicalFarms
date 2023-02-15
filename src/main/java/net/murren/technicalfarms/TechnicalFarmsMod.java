package net.murren.technicalfarms;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.murren.technicalfarms.registers.BlockRegister.registerBlocks;

public class TechnicalFarmsMod implements ModInitializer {
	public static final String MOD_ID = "technicalfarms";
	public static final Logger LOGGER = LoggerFactory.getLogger("technicalfarms");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		registerBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
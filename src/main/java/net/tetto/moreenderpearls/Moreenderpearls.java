package net.tetto.moreenderpearls;

import net.fabricmc.api.ModInitializer;
import net.tetto.moreenderpearls.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moreenderpearls implements ModInitializer {
	public static final String MOD_ID = "more-ender-pearls";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModLootTableModifiers.modifyLootTables();
	}
}
package net.kello.kellosorigins;

import net.fabricmc.api.ModInitializer;

import net.kello.kellosorigins.common.registry.ModPowers;
import net.kello.kellosorigins.common.registry.ModScaleTypes;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kellosorigins implements ModInitializer {
	public static final String MOD_ID = "kellosorigins";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPowers.init();
		ModScaleTypes.init();
		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String value) {
		return new Identifier(MOD_ID, value);
	}
}
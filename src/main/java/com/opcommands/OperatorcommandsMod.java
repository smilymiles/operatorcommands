package com.opcommands;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperatorcommandsMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("operatorcommands");

    @Override
    public void onInitialize() {
        LOGGER.info("OperatorCommands mod loaded!");
    }
}
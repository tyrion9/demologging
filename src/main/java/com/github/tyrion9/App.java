package com.github.tyrion9;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {
    static Logger logger = Logger.getLogger("com.github.tyrion9.App");

    public static void main(String[] args) {
        LogManager manager = LogManager.getLogManager();
        logger.info("Hello World!");
        logger.warning("How are you?");
    }
}

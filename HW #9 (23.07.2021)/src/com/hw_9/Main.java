package com.hw_9;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.info("this info about the program");
        logger.debug("all is good now");
        logger.warn("are you sure you need this?");
        logger.error("this is error!");
    }
}

package com.hw_9;

public class Logger {
    private static String RESET = "\u001B[0m";
    private enum LoggerLevel {

        INFO("\u001B[34m"),
        DEBUG("\u001B[32m"),
        WARN("\u001B[33m"),
        ERROR("\u001B[31m");

        private String level;

        LoggerLevel(String level) {
            this.level = level;
        }

        private String getLevel() {
            return level;
        }
    }

    public void info(String text) {
        printText(LoggerLevel.INFO, text);
    }

    public void debug(String text) {
        printText(LoggerLevel.DEBUG, text);
    }

    public void warn(String text) {
        printText(LoggerLevel.WARN, text);
    }

    public void error(String text) {
        printText(LoggerLevel.ERROR, text);
    }

    private void printText(LoggerLevel level, String text) {
        System.out.println(level.getLevel() + level + ": " + RESET + text);
    }

}

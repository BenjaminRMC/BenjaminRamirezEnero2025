package com.anahuac.software.creacional.singleton;

public class Logger {

    // Instancia única del Logger (Singleton)
    private static Logger instance;
    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    public void warning(String message) {
        System.out.println("WARNING: " + message);
    }

    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}

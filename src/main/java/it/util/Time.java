package it.util;

public class Time {

    private static final double RESULT_IN_SECONDS = 1E-9;
    
    private static final double TIME_STARTED = System.nanoTime();

    public static double getTime() {
        return (System.nanoTime() - TIME_STARTED) * RESULT_IN_SECONDS;
    }
}

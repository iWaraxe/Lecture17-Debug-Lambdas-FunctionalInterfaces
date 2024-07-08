package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Demonstrates using conditional breakpoints and evaluating expressions during debugging.
 * Set a conditional breakpoint inside the loop that only triggers when 'i' is equal to 5.
 */
public class Ex01AdvancedDebugging {

    public static void main(String[] args) {
        loopWithCondition();
    }

    /**
     * A method to demonstrate conditional breakpoints.
     * Try setting a conditional breakpoint to pause only when 'i' equals 5.
     */
    public static void loopWithCondition() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current loop index: " + i);
        }
    }
}

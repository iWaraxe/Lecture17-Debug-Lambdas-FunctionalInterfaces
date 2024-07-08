package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates basic debugging techniques using line and method breakpoints.
 * Set a breakpoint inside the 'calculate' method or on the lambda expression to see how breakpoints work.
 */
public class Ex01DebugBasics {

    public static void main(String[] args) {
        System.out.println("Starting calculation...");
        int result = calculate(10, 20);
        System.out.println("Calculation result: " + result);
    }

    /**
     * A simple method to demonstrate method breakpoints.
     * Set a breakpoint on entry to pause execution when this method starts.
     * @param a First integer to add.
     * @param b Second integer to add.
     * @return Sum of the two integers.
     */
    public static int calculate(int a, int b) {
        return a + b;
    }
}

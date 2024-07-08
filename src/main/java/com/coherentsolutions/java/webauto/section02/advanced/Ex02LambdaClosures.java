package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.function.IntUnaryOperator;

/**
 * Demonstrates the use of scoping and closures within lambda expressions.
 */
public class Ex02LambdaClosures {

    public static void main(String[] args) {
        final int factor = 2; // A variable to be captured
        int base = 10;

        // Lambda capturing a local variable
        IntUnaryOperator multiply = (int a) -> a * factor;
        System.out.println("Multiplying: " + multiply.applyAsInt(base));
    }
}

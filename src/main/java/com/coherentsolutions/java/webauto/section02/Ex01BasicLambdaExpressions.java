package com.coherentsolutions.java.webauto.section02;

import java.util.function.IntBinaryOperator;

/**
 * Demonstrates basic lambda expressions for arithmetic operations.
 */
public class Ex01BasicLambdaExpressions {

    public static void main(String[] args) {
        // Lambda expression for summing two integers
        IntBinaryOperator sum = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Sum: " + sum.applyAsInt(5, 10));

        // Lambda expression for multiplying two integers
        IntBinaryOperator product = (a, b) -> a * b;
        System.out.println("Product: " + product.applyAsInt(5, 10));

        // Lambda expression for subtracting two integers
        IntBinaryOperator subtract = (a, b) -> a - b;
        System.out.println("Difference: " + subtract.applyAsInt(10, 5));

        // Lambda for printing x->System.out.println(x);
    }
}

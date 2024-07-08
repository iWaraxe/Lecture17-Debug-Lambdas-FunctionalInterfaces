package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.function.BiFunction;

/**
 * Demonstrates advanced lambda expressions including type declarations.
 */
public class Ex01AdvancedLambdaTypeDeclarations {

    public static void main(String[] args) {
        // Lambda with explicit type declarations
        BiFunction<Integer, Integer, Integer> add = (Integer a, Integer b) -> a + b;
        System.out.println("Addition with types: " + add.apply(20, 22));

        // Lambda for division with type declarations
        BiFunction<Integer, Integer, Double> divide = (Integer a, Integer b) -> (double) a / b;
        System.out.println("Division result: " + divide.apply(100, 4));
    }
}

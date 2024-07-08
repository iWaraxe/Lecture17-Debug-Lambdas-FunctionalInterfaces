package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.Comparator;

/**
 * Demonstrates a functional interface that includes default and static methods.
 */
public class Ex02FunctionalInterfaceWithMethods {

    @FunctionalInterface
    interface Calculator {
        int operate(int a, int b);

        default void printResult(int a, int b) {
            System.out.println("Operation result: " + operate(a, b));
        }

        static void greet() {
            System.out.println("Hello from Calculator!");
        }
    }

    public static void main(String[] args) {
        Calculator adder = (a, b) -> a + b;
        adder.printResult(5, 3);
        Calculator.greet();
    }
}

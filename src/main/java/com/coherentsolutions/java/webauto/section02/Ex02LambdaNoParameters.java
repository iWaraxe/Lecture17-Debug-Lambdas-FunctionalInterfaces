package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates lambda expressions that do not require parameters.
 */
public class Ex02LambdaNoParameters {

    public static void main(String[] args) {
        // Lambda expression for printing a message
        Runnable sayHello = () -> System.out.println("Hello, world!");
        sayHello.run();

        // Lambda expression for returning a constant value
        Runnable returnFortyTwo = () -> System.out.println(42);
        returnFortyTwo.run();
    }
}

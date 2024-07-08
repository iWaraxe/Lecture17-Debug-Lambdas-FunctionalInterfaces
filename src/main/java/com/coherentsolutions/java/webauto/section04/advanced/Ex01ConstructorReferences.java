package com.coherentsolutions.java.webauto.section04.advanced;

import java.util.function.Function;

/**
 * Demonstrates the use of constructor references.
 */
public class Ex01ConstructorReferences {

    public static void main(String[] args) {
        Function<String, Integer> stringToInteger = Integer::new;
        Integer number = stringToInteger.apply("100");
        System.out.println("Converted String to Integer: " + number);
    }
}

package com.coherentsolutions.java.webauto.section04;

import java.util.function.Consumer;

/**
 * Demonstrates the use of an instance method reference of a particular object.
 */
public class Ex02InstanceMethodReference {

    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;
        printer.accept("Hello, World!");
    }
}

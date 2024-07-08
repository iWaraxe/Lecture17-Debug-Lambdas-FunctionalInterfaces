package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.function.Consumer;

/**
 * Demonstrates creating and using a custom functional interface.
 */
public class Ex01CustomFunctionalInterface {

    @FunctionalInterface
    interface GreetFunction {
        void sayHello(String name);
    }

    public static void main(String[] args) {
        GreetFunction greeter = name -> System.out.println("Hello, " + name + "!");
        Consumer<String> consumer = name -> System.out.println("Hello, " + name + "!");
        greeter.sayHello("Java Learner");
        consumer.accept("Java Learner");
    }
}

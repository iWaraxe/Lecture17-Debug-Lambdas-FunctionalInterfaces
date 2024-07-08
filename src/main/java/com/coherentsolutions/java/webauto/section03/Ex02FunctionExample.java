package com.coherentsolutions.java.webauto.section03;

import java.util.List;
import java.util.function.Function;

/**
 * Demonstrates the use of the Function functional interface.
 */
public class Ex02FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> valueConverter = str -> Integer.valueOf(str);
        System.out.println("String '678' converted to Integer: " + valueConverter.apply("678"));

        List<String> list = List.of("2","3","5","6","7","8","9");
        list.stream()
                .map(str -> Integer.valueOf(str))
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

    }
}

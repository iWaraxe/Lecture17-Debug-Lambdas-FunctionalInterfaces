package com.coherentsolutions.java.webauto.section03;

import java.util.List;
import java.util.function.Predicate;

/**
 * Demonstrates the use of the Predicate functional interface.
 */
public class Ex01PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

        System.out.println("Is 4 even? " + isEvenNumber.test(4));
        System.out.println("Is 3 even? " + isEvenNumber.test(3));

        List<Integer> list = List.of(2,3,5,6,7,8,9);
        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}

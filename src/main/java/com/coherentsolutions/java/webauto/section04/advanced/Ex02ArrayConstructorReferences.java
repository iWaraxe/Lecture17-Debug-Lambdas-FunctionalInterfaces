package com.coherentsolutions.java.webauto.section04.advanced;

import java.util.function.IntFunction;

/**
 * Demonstrates the use of array constructor references.
 */
public class Ex02ArrayConstructorReferences {

    public static void main(String[] args) {
        IntFunction<int[]> arrayCreator = int[]::new;
        int[] array = arrayCreator.apply(5);  // Creates an array of size 5
        System.out.println("Array created with size: " + array.length);
    }
}

package com.coherentsolutions.java.webauto.section04;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates the use of a static method reference for sorting an array.
 */
public class Ex01StaticMethodReference {

    public static void main(String[] args) {
        String[] words = {"cherry", "banana", "apple"};
        System.out.println("Original array: " + Arrays.toString(words));

        Arrays.sort(words, Ex01StaticMethodReference::caseInsensitiveCompare);
        System.out.println("Sorted array: " + Arrays.toString(words));
    }


    public static int caseInsensitiveCompare(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}

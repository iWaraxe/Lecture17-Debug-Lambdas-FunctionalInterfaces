package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates using class breakpoints and how to manage them in IntelliJ IDEA.
 * Set a class breakpoint to see the execution pause every time a method in this class is called.
 */
public class Ex02DebugClassBreakpoint {

    public static void main(String[] args) {
        testMethodOne();
        testMethodTwo();
    }

    public static void testMethodOne() {
        System.out.println("In testMethodOne");
    }

    public static void testMethodTwo() {
        System.out.println("In testMethodTwo");
    }
}

package com.bridgelabz;

public class Maximum {
    public static <T extends Comparable> T testCase(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to maximum number program !");
        System.out.println("Maximum among three integer values is :" + testCase(9, 5, 10));
        System.out.println("Maximum among three float values is :" + testCase(9.8f, 5.7f, 101.7f));
        System.out.println("Maximum among three string values is :" + testCase("Annu", "Garima", "Sheetal"));

    }
}




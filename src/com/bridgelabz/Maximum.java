package com.bridgelabz;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome to maximum number program !");

        Maximum maximum = new Maximum();

        System.out.println("Maximum string among three string is : " + maximum.compareTo());

    }

    // compareTo method check the maximum number among three numbers and return it :-
    public String compareTo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string");
        String string1 = scanner.next();

        System.out.println("Enter second string");
        String string2 = scanner.next();

        System.out.println("Enter third number");
        String string3 = scanner.next();

        String maximum = string1;

        if(string2.compareTo(maximum) > 0){
            maximum = string2;

        }
        if (string3.compareTo(maximum) > 0){
            maximum = string3;

        }
        return maximum;
    }
}




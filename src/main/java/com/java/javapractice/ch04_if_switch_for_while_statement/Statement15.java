package com.java.javapractice.ch04_if_switch_for_while_statement;

import java.io.PrintStream;

public class Statement15 {
    public static void main(String[] args) {
        System.out.println("i    2*i    2*i-1    i*i    11-i    i%3    i/3");
        System.out.println("----------------------------------------------");

        for(int i=1; i<=10; i++){
            PrintStream printf = System.out.printf("%-4d %-6d %-8d %-6d %-7d %-7d %-5d %n",
                    i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3);
        }

//        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
//        System.out.println("----------------------------------------------");
//
//        for(int i=1; i<=10; i++){
//            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
//        }
    }
}

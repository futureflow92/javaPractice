package com.java.javapractice.ch04_if_switch_for_while_statement;

public class Statement26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while((sum += ++i)<= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}

package com.java.javapractice.ch04_if_switch_for_while_statement;

public class Statement13 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++){
            sum += i;
            System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
        }
    }
}

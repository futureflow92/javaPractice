package com.java.javapractice.ch04_if_switch_for_while_statement;

public class Statement31 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            if(i%3==0)
                continue;
            System.out.println(i);
        }
    }
}

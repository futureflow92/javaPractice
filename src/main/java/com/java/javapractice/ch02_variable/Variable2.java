package com.java.javapractice.ch02_variable;

public class Variable2 {
    public static void main(String[] args) {
        int x=10, y=20;
        int tmp = 0;

        System.out.println("x: "+ x + ", y: "+ y);

        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x: "+x+", y: "+ y);
    }
}

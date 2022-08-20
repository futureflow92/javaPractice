package com.java.javapractice.ch02_variable;

public class Variable11 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%d%n", i);
        System.out.printf("%X%n", i);
    }
}

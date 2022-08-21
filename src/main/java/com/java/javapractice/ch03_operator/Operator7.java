package com.java.javapractice.ch03_operator;

public class Operator7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b);   //10*30=300이므로 byte의 범위인 -128~127을 벗어난다. 따라서 출력결과로 300을 얻을 수 없다.
        System.out.println(c);
    }
}

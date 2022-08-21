package com.java.javapractice.ch03_operator;

public class Operator8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c1 = a*b;      //int형의 범위는 약 -20억~+20억 이므로 원하는 결과인 2000000000000을 얻을 수 없다.
        long c2 = (long)a*b;    //long으로 형변환 하면 원하는 값을 얻을 수 있다.

        System.out.println(c1);
        System.out.println(c2);

    }
}

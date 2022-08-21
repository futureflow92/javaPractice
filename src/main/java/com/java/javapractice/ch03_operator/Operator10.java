package com.java.javapractice.ch03_operator;

public class Operator10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        //곱하기 연산을 먼저 실행하기 때문에 오버플로우 발생 후 나누기 연산을 실행한 경우 원하는 값은 얻을 수 없다.
        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
//        System.out.println(result1);
//        System.out.println(result2);
    }
}

package com.java.javapractice.ch03_operator;

public class Operator9 {
    public static void main(String[] args) {
        //int타입과 int의 연산을 하면 결과는 int로 나오고 이미 오버플로우가 발생한 값을 long타입 변수에 넣는다고 달라질게 없다.
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

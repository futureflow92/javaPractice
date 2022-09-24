package com.java.javapractice.ch07_OOP2;

class MyCard2 {
    final int NUMBER;   //상수지만 선언과 함께 초기화 하지 않고
    final String KIND;  //생성자에서 단 한번만 초기화할 수 있다.
    static int width = 100;
    static int height = 250;

    MyCard2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    MyCard2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        MyCard2 c = new MyCard2("HEART", 10);
//        c.NUMBER = 5;   에러! final이 붙은 변수는 상수이므로 선언과 동시에 초기화 또는 생성자에서 초기화
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c); //System.out.println(c.toString());
    }
}

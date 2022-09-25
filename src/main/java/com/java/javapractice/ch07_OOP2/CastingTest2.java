package com.java.javapractice.ch07_OOP2;

public class CastingTest2 {
    public static void main(String[] args) {
        Car4 car = new Car4();
        Car4 car2 = null;
        FireEngine fe = null;

        car.drive();
//        fe = (FireEngine)car;   //에러 자손타입의 참조변수로 조상 객체 접근
//        fe.drive();
//        car2 = fe;
//        car.drive();
    }
}

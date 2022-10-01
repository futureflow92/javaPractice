package com.java.javapractice.ch07_OOP2;

class DefaultMethodTest {
    public static void main(String[] args) {
        MyChild c = new MyChild();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class MyChild extends MyParent implements MyInterface, MyInterface2 {
    public void method1(){
        System.out.println("method1() in MyChild"); //오버라이딩
    }
}

class MyParent {
    public void method2() {
        System.out.println("method2() in MyParent");
    }

}

interface MyInterface {

    default void method1() {
        System.out.println("method1() in MyParent");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}


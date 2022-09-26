package com.java.javapractice.ch07_OOP2;

class BindingTest3 {
    public static void main(String[] args) {
        Parent111 p = new Child111();
        Child111 c = new Child111();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent111 {
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child111 extends Parent111 {
    int x = 200;

    void method() {
        System.out.println("x="+x); //this.x와 같다.
        System.out.println("super.x="+super.x);
        System.out.println("this.x="+this.x);
    }
}
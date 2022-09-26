package com.java.javapractice.ch07_OOP2;

class BindingTest2 {
    public static void main(String[] args) {
        Parent11 p = new Child11();
        Child11 c = new Child11();

        System.out.println("p.x = "+p.x);
        p.method();

        System.out.println("c.x = "+c.x);
        c.method();
    }
}

class Parent11 {
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child11 extends Parent11 { }

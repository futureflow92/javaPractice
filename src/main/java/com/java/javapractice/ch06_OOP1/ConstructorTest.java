package com.java.javapractice.ch06_OOP1;
class Data3 {
    int value;
}

class Data4 {
    int value;

    Data4(int x){   //매개변수가 있는 생성자
        value = x;
    }
}
class ConstructorTest {
    public static void main(String[] args) {
        Data3 d3 = new Data3();
     // Data2 d2 = new Data2();      //compile error 발생
        Data4 d4 = new Data4(10); //ok
    }
}

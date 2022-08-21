package com.java.javapractice.ch03_operator;

public class Operator6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); //(byte)로 형변환 하지 않으면 int로 계산결과가 나오기 때문에 타입 불일치로 컴파일 에러가 발생한다.
        System.out.println(c);


    }
}

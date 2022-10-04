package com.java.javapractice.ch08_ExceptionHandling;

class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
//            try {} catch (Exception e) {}//에러! 변수 e가 중복 선언 되었다. 바로 직전 e와 중복
        }
        try {

        } catch (Exception e) {

        }
    }
}

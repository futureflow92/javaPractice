package com.java.javapractice.practice;

public class chapter4_13 {
    public static void main(String[] args) {
        String value = "12o23";
        char ch = ' ';
        boolean isNumber = true;

        for(int i=0; i<value.length(); i++){
            ch= value.charAt(i);
            if(!('0'<=ch && ch<='9')){
                isNumber = false;
                break;  //반복문을 빠져나온다.
            }
        }
        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    }

}

package com.java.javapractice.ch05_array;

public class Array14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i<src.length(); i++){
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):"+ch);
        }
        //String을 char[]로 변환
        char[] chArr = src.toCharArray();

        System.out.println(chArr);
    }
}

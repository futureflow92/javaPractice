package com.java.javapractice.practice;

public class chapter4_5 {
    public static void main(String[] args) {
        int i = 0;
//        int j = 0; 위치가 틀렸음
        while(i<=10) {
//            i++; 위치가 틀렸음
            int j = 0;
            while(j<=i) {
                System.out.print("*");
                j++;
//                System.out.println(); 위치가 틀렸음
            }
            System.out.println();
            i++;
        }
    }
}

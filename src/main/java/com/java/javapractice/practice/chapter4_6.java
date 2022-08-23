package com.java.javapractice.practice;

public class chapter4_6 {
    public static void main(String[] args) {
        int sum = 0;
        int count =0;

        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6; j++) {
                sum = i+j;
                if(sum==6) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

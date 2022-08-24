package com.java.javapractice.practice;

public class chapter4_6 {
    public static void main(String[] args) {
        int sum = 0;
        int count =0;

        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6; j++) {
                sum = i+j;
                if(sum==6) {
                    System.out.println("i="+i+", j="+j);
                    count++;
                }
            }
        }

        System.out.println("합이 6인 경우의 수는: "+count);
    }
}

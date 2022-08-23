package com.java.javapractice.practice;

public class chapter4_12 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++) {
            if(i>1) {
                System.out.println();
            }
            for(int j=2; j<=9; j++) {
                System.out.printf("%d*%d=%d\t", j, i, j*i);
            }
        }
    }
}

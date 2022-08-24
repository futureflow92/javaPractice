package com.java.javapractice.practice;

public class chapter4_8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int x=0; x<=10; x++) {
            for(int y=0; y<=10; y++) {
                sum = 2*x + 4*y;        // 간단하게 if(2*x+4*y==10) 한줄로 줄일 수 있음
                if(sum==10) {
                    System.out.println("x="+x+", y="+y);
                }
            }

        }

    }
}

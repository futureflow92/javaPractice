package com.java.javapractice.practice;

public class chapter4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalsSum = 0;
        for(int i=1; i<=10; i++) {
            sum += i;
            totalsSum += sum;
        }
        System.out.println(sum);    //55
    }
}

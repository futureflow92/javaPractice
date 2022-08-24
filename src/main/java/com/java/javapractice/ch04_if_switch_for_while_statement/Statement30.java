package com.java.javapractice.ch04_if_switch_for_while_statement;

public class Statement30 {
    public static void main(String[] args) {
        int sum = 0;
        int i =0;

        while(true){
            if(sum > 100) {
                break;
            }
            ++i;
            sum += i;
        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}

package com.java.javapractice.ch04_if_switch_for_while_statement;

import java.util.Scanner;

public class Statement3 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input==0){
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }
}

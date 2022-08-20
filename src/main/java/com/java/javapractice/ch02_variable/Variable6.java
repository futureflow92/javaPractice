package com.java.javapractice.ch02_variable;

import java.util.Scanner;

public class Variable6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해주세요>");
        String tmp = scanner.nextLine();
        int num = Integer.parseInt(tmp);

        System.out.println("입력내용: "+num);
//        System.out.println("num=" + num);
        System.out.printf("num=%d%n", num);
    }
}

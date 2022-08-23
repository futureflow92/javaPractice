package com.java.javapractice.practice;

import java.util.Scanner;

public class chapter4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner s = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt();

            if(input<answer) {
                System.out.println("입력하신 값보다 큰 수를 입력하세요.");
            } else if (input>answer) {
                System.out.println("입력하신 값보다 작은 수를 입력하세요. ");
            } else {
                System.out.println("정답입니다.");
                System.out.println("시도횟수는"+count+"번 입니다.");
                break;
            }

        } while(true);

    }
}

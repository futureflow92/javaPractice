package com.java.javapractice.ch04_if_switch_for_while_statement;

public class Statement24 {
    public static void main(String[] args) {
        int i=11;

        System.out.println("카운트 다운을 시작합니다.");

        while(i--!=0){
            System.out.println(i);

//            for(int j=0; j<2_000_000_000; j++){   //빈 문장 (시간 지연용)
//                ;
//            }
        }
        System.out.println("Game Over");
    }
}

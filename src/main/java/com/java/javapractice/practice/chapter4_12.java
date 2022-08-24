package com.java.javapractice.practice;

public class chapter4_12 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=3; j++) {
                int x = j+1+(i-1)/3*3;
                int y = i%3==0 ? 3: i%3;

                if(x>9){
                    break;
                }
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
            if(i%3==0){
                System.out.println();
            }
        }
//        for(int i=1; i<=3; i++){
//            if(i>1){
//                System.out.println();
//            }
//            for(int j=2; j<=4; j++) {
//                System.out.printf("%d*%d=%d\t", j, i, j*i);
//            }
//        }
//        System.out.println();
//        System.out.println();
//
//        for(int k=1; k<=3; k++){
//            if(k>1){
//                System.out.println();
//            }
//            for(int l=5; l<=7; l++){
//                System.out.printf("%d*%d=%d\t", l, k, l*k);
//            }
//        }
//        System.out.println();
//        System.out.println();
//
//        for(int m=1; m<=3; m++){
//            if(m>1){
//                System.out.println();
//            }
//            for(int n=8; n<=9; n++){
//                System.out.printf("%d*%d=%d\t", n, m, n*m);
//            }
//        }
    }
}

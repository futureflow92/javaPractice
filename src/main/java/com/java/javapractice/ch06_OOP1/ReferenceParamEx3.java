package com.java.javapractice.ch06_OOP1;

class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");

        for(int i : arr) //향상된 for문
            System.out.print(i+",");
        System.out.println("]");
    }

    static int sumArr(int[] arr) {        //배열의 모든 요소의 합을 반환
        int sum = 0;

        for(int i=0; i<arr.length; i++)   //for(int j : arr) sum += j; 향상된 for문 사용 가능
            sum += arr[i];
        return sum;
    }

    static void sortArr(int[] arr) {      //배열을 오름차순으로 정렬(매개변수 타입은 참조형)
        for(int i=0; i<arr.length-1-i; i++){
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
    }
}

package com.java.javapractice.ch09_java.langPackage_utilClasses;

class Card1 {
    String kind;
    int number;

    Card1() {
        this("SPADE", 1);   //Card(String kind, int number)를 호출
    }

    Card1(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }
}

public class CardToString2 {
    public static void main(String[] args) {
        Card1 c1 = new Card1();
        Card1 c2 = new Card1("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

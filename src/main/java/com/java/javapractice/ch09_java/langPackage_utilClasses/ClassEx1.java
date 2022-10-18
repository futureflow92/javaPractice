package com.java.javapractice.ch09_java.langPackage_utilClasses;

final class Card9 {
    String kind;
    int num;

    Card9() {
        this("SPADE", 1);
    }

    Card9(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}

class ClassEx1{
    public static void main(String[] args) throws Exception {
        Card9 c = new Card9("HEART", 3); //new연산자로 객체 생성
        Card9 c2 = Card9.class.newInstance(); //Class객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}

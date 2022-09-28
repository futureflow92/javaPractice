package com.java.javapractice.ch07_OOP2;

import java.util.Vector;

class Product100 {
    int price;
    int bonusPoint;

    Product100(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product100(){
        price = 0;
        bonusPoint = 0;
    }
}

class Tv100 extends Product100 {
    Tv100() { super(100); }
    public String toString() { return "Tv"; }
}

class Computer100 extends Product100{
    Computer100() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio100 extends Product100 {
    Audio100() { super(50);}
    public String toString() { return "Audio"; }
}

class Buyer100 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product100 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p+"을/를 구입하셨습니다.");
    }

    void refund(Product100 p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {        //구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;        //구입한 물품의 가격합계
        String itemList = "";

        if(item.isEmpty()) {    //Vector가 비어있는지 확인한다.
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for(int i=0; i<item.size(); i++) {
            Product100 p = (Product100)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer100 b = new Buyer100();
        Tv100 tv = new Tv100();
        Computer100 com = new Computer100();
        Audio100 audio = new Audio100();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}

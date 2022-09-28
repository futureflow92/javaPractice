package com.java.javapractice.ch07_OOP2;

class Product10 {
    int price;
    int bonusPoint;

    Product10(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

}

class Tv10 extends Product10 {
    Tv10() { super(100); }
    public String toString() { return "Tv"; }
}

class Computer10 extends Product10 {
    Computer10() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio10 extends Product10 {
    Audio10() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer10 {
    int money = 1000;
    int bonusPoint = 0;
    Product10[] item = new Product10[10];   //구입한 제품을 저장하기 위한 배열
    int i = 0;      //Product 배열에 사용될 카운터

    void buy(Product10 p) {
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0; i<item.length; i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 "+ sum + "만원입니다.");
        System.out.println("구입하신 제품은 "+ itemList + "입니다.");
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer10 b = new Buyer10();

        b.buy(new Tv10());
        b.buy(new Computer10());
        b.buy(new Audio10());
        b.summary();
    }

}

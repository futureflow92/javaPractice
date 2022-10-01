package com.java.javapractice.ch07_OOP2;

class ReqairableTest {
    public static void main(String[] args) {
        MyTank tank = new MyTank();
        MyDropship dropship = new MyDropship();

        MyMarine marine = new MyMarine();
        MySCV scv = new MySCV();
        scv.repair(tank); //SCV가 Tank를 수리하도록 한다.
        scv.repair(dropship);
//        scv.repair(marine); //에러!
    }
}

interface Repairable { }

class MyUnit {
    int hitPoint;
    final int MAX_HP;
    MyUnit(int hp) {
        MAX_HP = hp;
    }
    //...
}

class MyGroundUnit extends MyUnit {
    MyGroundUnit(int hp) {
        super(hp);
    }
}

class MyAirUnit extends MyUnit {
    MyAirUnit(int hp){
        super(hp);
    }
}

class MyTank extends MyGroundUnit implements Repairable {
    MyTank() {
        super(150);     //Tank의 HP는 150이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
    //...
}

class MyDropship extends MyAirUnit implements Repairable {
    MyDropship() {
        super(125); //Dropship의 HP는 125다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
    //...
}

class MyMarine extends MyGroundUnit {
    MyMarine() {
        super(40);
        hitPoint = MAX_HP;
    }
    //...
}

class MySCV extends MyGroundUnit implements Repairable {
    MySCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if(r instanceof MyUnit) {
            MyUnit u = (MyUnit) r;
            while(u.hitPoint != u.MAX_HP) {
                /* Unit의 HP를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
    //...
}

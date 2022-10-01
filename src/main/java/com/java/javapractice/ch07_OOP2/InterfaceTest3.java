package com.java.javapractice.ch07_OOP2;

class InterfaceTest3 {
    public static void main(String[] args) {
        AA aa =new AA();
        aa.methodA();
    }
}

class AA {
    void methodA() {
        II ii = InstanceManager.getInstance();
        ii.methodB();
        System.out.println(ii.toString());   //i로 Object 클래스의 메서드 호출가능
    }
}

interface II {
    public abstract void methodB();
}

class BB implements II {
    public void methodB(){
        System.out.println("methodB in B class");
    }

    public String toString() { return "class B";}
}

class InstanceManager {
    public static II getInstance(){
        return new BB();
    }
}

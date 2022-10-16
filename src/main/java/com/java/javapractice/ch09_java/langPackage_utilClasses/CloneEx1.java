package com.java.javapractice.ch09_java.langPackage_utilClasses;


class Point implements Cloneable {  //Cloneable 인터페이스를 구현한 클래스에서만 clone()사용 가능. 안그럼 예외 발생.
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x= " + x + ", y= " + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone(); //clone()은 반드시 예외처리를 해줘야한다.
        } catch (CloneNotSupportedException e) {}
        return obj;
    }

}

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone(); //복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}

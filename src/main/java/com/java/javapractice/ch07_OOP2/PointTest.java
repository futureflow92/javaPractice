package com.java.javapractice.ch07_OOP2;

class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}

class Point1 {
    int x, y;

//    Point(){}   //기본생성자

    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x : "+x+", y :"+y;
    }
}

class Point3D extends Point1 {
    int z;

    Point3D(int x, int y, int z){
        //생성자 첫 줄에서 다른 생성자를 호출하지 않으면 컴파일러가 super(); 를 삽입한다.
        super(x,y); //조상클래스의 생성자 Point(int x, int y)를 호출한다.
        this.z = z;
    }

    String getLocation(){   //오버라이딩
        return "x : "+x+", y : "+y+", z : "+z;
    }
}
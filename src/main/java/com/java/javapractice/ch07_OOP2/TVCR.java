package com.java.javapractice.ch07_OOP2;

class Tv1 {
    boolean power;  //전원상태(on/off)
    int channel;    //채널
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter =0;
    void power() { power = !power;}
    void play() {
        System.out.println("play");
    }
    void stop() {
        System.out.println("stop");
    }
}
public class TVCR {
    VCR vcr = new VCR();    //VCR클래스를 포함시켜서 사용한다.
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop(){
        vcr.stop();
    }


}

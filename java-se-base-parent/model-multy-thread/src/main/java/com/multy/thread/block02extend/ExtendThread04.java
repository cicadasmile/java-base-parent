package com.multy.thread.block02extend;

import java.util.concurrent.TimeUnit;

public class ExtendThread04 {
    public static void main(String[] args) {
        JoinThreadA joinThreadA = new JoinThreadA() ;
        joinThreadA.start();
    }
}
class JoinThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("缺水中...");
        JoinThreadB joinThreadB = new JoinThreadB() ;
        joinThreadB.start();
        try{
            joinThreadB.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("喝水中...");
    }
}
class JoinThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("买水中...");
        try{
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("买到水...");
    }
}

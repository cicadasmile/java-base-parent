package com.multy.thread.block01create;
/**
 * 线程创建方式一：继承Thread类
 */
public class CreateThread01 {
    public static void main(String[] args) {
        // 调用方法
        MyThread1 myThread1 = new MyThread1() ;
        myThread1.start();
    }
}
class MyThread1 extends Thread {
    // 设置线程名称
    public MyThread1 (){
        super("CicadaThread");
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
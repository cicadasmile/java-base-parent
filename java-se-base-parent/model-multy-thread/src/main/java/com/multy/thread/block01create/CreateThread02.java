package com.multy.thread.block01create;
/**
 * 线程创建方式二：实现 Runnable 接口
 */
public class CreateThread02 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2(),"MyThread2") ;
        thread.start();
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run ...");
    }
}
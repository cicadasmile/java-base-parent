package com.multy.thread.block01create;
/**
 * 线程创建方式三：匿名内部类
 */
public class CreateThread03 {
    public static void main(String[] args) {
        //方式1
        new Thread("ThreadName1") {
            public void run() {
                System.out.println("1:"+Thread.currentThread().getName());
            };
        }.start();

        //方式2
        new Thread(new Runnable() {
            public void run() {
                System.out.println("2:"+Thread.currentThread().getName());
            }
        },"ThreadName2"){
            // 这里重写了run方法
            @Override
            public void run() {
                System.out.println("3:"+Thread.currentThread().getName());
            }
        }.start();
    }
}

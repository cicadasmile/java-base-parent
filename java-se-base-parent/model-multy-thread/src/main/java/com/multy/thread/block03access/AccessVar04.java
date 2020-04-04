package com.multy.thread.block03access;

public class AccessVar04 {
    public static void main(String[] args) {
        Var04Test var04Test1 = new Var04Test() ;
        Thread thread1 = new Thread(var04Test1) ;
        thread1.start();
        Var04Test var04Test2 = new Var04Test() ;
        Thread thread2 = new Thread(var04Test2) ;
        thread2.start();
    }
}
class Var04Test implements Runnable {
    private static Integer count ;
    public Var04Test (){
        count = 0 ;
    }
    public synchronized static void countAdd() {
        System.out.println(Thread.currentThread().getName()+"；count="+(count++));
    }
    @Override
    public void run() {
        countAdd() ;
    }
}

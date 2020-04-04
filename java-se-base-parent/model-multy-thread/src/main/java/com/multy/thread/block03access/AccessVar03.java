package com.multy.thread.block03access;

public class AccessVar03 {
    public static void main(String[] args) {
        Var03Test var03Test1 = new Var03Test() ;
        Thread thread1 = new Thread(var03Test1) ;
        thread1.start();
        Thread thread2 = new Thread(var03Test1) ;
        thread2.start();
        Thread thread3 = new Thread(var03Test1) ;
        thread3.start();
    }
}
class Var03Test implements Runnable {
    private Integer count = 0 ;
    public void countAdd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(this) {
            count++ ;
            System.out.println("count="+count);
        }
    }
    @Override
    public void run() {
        countAdd() ;
    }
}
package com.multy.thread.block06lock02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockAPI02 {
    public static void main(String[] args) {
        PrintInfo printInfo = new PrintInfo() ;
        ExecutorService service =  Executors.newFixedThreadPool(3);
        service.execute(new PrintA(printInfo));
        service.execute(new PrintB(printInfo));
        service.execute(new PrintC(printInfo));
    }
}
class PrintA implements Runnable {
    private PrintInfo printInfo ;
    public PrintA (PrintInfo printInfo){
        this.printInfo = printInfo ;
    }
    @Override
    public void run() {
        printInfo.printA ();
    }
}
class PrintB implements Runnable {
    private PrintInfo printInfo ;
    public PrintB (PrintInfo printInfo){
        this.printInfo = printInfo ;
    }
    @Override
    public void run() {
        printInfo.printB ();
    }
}
class PrintC implements Runnable {
    private PrintInfo printInfo ;
    public PrintC (PrintInfo printInfo){
        this.printInfo = printInfo ;
    }
    @Override
    public void run() {
        printInfo.printC ();
    }
}
class PrintInfo {
    // 控制下个执行的线程
    private String info = "A";
    private ReentrantLock lock = new ReentrantLock();
    // 三个线程，三个控制条件
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();
    public void printA (){
        try {
            lock.lock();
            while (!info.equals("A")) {
                conditionA.await();
            }
            System.out.print("A");
            info = "B";
            conditionB.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printB (){
        try {
            lock.lock();
            while (!info.equals("B")) {
                conditionB.await();
            }
            System.out.print("B");
            info = "C";
            conditionC.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printC (){
        try {
            lock.lock();
            while (!info.equals("C")) {
                conditionC.await();
            }
            System.out.print("C");
            info = "A";
            conditionA.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
package com.multy.thread.block05lock01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread02 {
    public static void main(String[] args) {
        LockNum lockNum = new LockNum() ;
        LockThread lockThread1 = new LockThread(lockNum,"TH1");
        LockThread lockThread2 = new LockThread(lockNum,"TH2");
        LockThread lockThread3 = new LockThread(lockNum,"TH3");
        lockThread1.start();
        lockThread2.start();
        lockThread3.start();
    }
}
class LockNum {
    private Lock lock = new ReentrantLock() ;
    public void getNum (){
        lock.lock();
        try {
            for (int i = 0 ; i < 3 ; i++){
                System.out.println("ThreadName:"+Thread.currentThread().getName()+";i="+i);
            }
        } finally {
            lock.unlock();
        }
    }
}
class LockThread extends Thread {
    private LockNum lockNum ;
    public LockThread (LockNum lockNum,String name){
        this.lockNum = lockNum ;
        super.setName(name);
    }
    @Override
    public void run() {
        lockNum.getNum();
    }
}
package com.multy.thread.block03access;

public class AccessVar05 {
}
class Var05Test {
    private volatile boolean myFlag = true ;
    public void setFlag (boolean myFlag){
        this.myFlag = myFlag ;
    }
    public void method() {
        while (myFlag){
            try {
                System.out.println(Thread.currentThread().getName()+myFlag);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
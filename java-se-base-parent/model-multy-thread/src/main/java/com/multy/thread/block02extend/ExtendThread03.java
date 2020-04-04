package com.multy.thread.block02extend;

public class ExtendThread03 {
    public static void main(String[] args) {
        Priority01 priority01 = new Priority01();
        priority01.start();
        System.out.println("priority01="+priority01.getPriority());
        Priority02 priority02 = new Priority02();
        priority02.start();
        System.out.println("priority02="+priority02.getPriority());
        priority01.setPriority(10);
        priority02.setPriority(1);
    }
}
class Priority01 extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
            System.out.println(Thread.currentThread().getName()+";i="+i);
        }
    }
}
class Priority02 extends Thread {
    @Override
    public void run() {
        for (int a = 0 ; a < 100 ; a++){
            System.out.println(Thread.currentThread().getName()+";a="+a);
        }
    }
}
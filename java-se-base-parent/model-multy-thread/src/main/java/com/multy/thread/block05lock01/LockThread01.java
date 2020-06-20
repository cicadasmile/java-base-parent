package com.multy.thread.block05lock01;

public class LockThread01 {
    public static void main(String[] args) {
        CountAdd countAdd = new CountAdd() ;
        AddThread01 addThread01 = new AddThread01(countAdd) ;
        addThread01.start();
        AddThread02 varThread02 = new AddThread02(countAdd) ;
        varThread02.start();
    }
}
class AddThread01 extends Thread {
    private CountAdd countAdd  ;
    public AddThread01 (CountAdd countAdd){
        this.countAdd = countAdd ;
    }
    @Override
    public void run() {
        countAdd.countAdd(30);
    }
}
class AddThread02 extends Thread {
    private CountAdd countAdd  ;
    public AddThread02 (CountAdd countAdd){
        this.countAdd = countAdd ;
    }
    @Override
    public void run() {
        countAdd.countAdd(10);
    }
}
class CountAdd {
    private Integer count = 0 ;
    public void countAdd (Integer num){
        try {
            if (num == 30){
                count = count + 50 ;
                Thread.sleep(3000);
            } else {
                count = count + num ;
            }
            System.out.println("num="+num+";count="+count);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
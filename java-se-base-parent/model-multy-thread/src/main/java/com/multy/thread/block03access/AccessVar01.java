package com.multy.thread.block03access;

public class AccessVar01 {
    public static void main(String[] args) {
        Var01Test var01Test = new Var01Test() ;
        VarThread01A varThread01A = new VarThread01A(var01Test) ;
        varThread01A.start();
        VarThread01B varThread01B = new VarThread01B(var01Test) ;
        varThread01B.start();
    }
}
class VarThread01A extends Thread {
    Var01Test var01Test = new Var01Test() ;
    public VarThread01A (Var01Test var01Test){
        this.var01Test = var01Test ;
    }
    @Override
    public void run() {
        var01Test.addNum(50);
    }
}
class VarThread01B extends Thread {
    Var01Test var01Test = new Var01Test() ;
    public VarThread01B (Var01Test var01Test){
        this.var01Test = var01Test ;
    }
    @Override
    public void run() {
        var01Test.addNum(10);
    }
}
class Var01Test {
    private Integer num = 0 ;
    public synchronized void addNum (Integer var){
        // Integer num = 0 ;
        try {
            if (var == 50){
                num = num + 50 ;
                Thread.sleep(3000);
            } else {
                num = num + var ;
            }
            System.out.println("var="+var+";num="+num);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
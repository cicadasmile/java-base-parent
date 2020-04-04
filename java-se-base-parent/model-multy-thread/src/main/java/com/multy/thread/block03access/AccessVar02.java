package com.multy.thread.block03access;

public class AccessVar02 {
    public static void main(String[] args) {
        Var02Test var02Test = new Var02Test ();
        VarThread02A varThread02A = new VarThread02A(var02Test) ;
        varThread02A.start();
        VarThread02B varThread02B = new VarThread02B(var02Test) ;
        varThread02B.start();
        var02Test.readValue();
    }
}
class VarThread02A extends Thread {
    Var02Test var02Test = new Var02Test ();
    public VarThread02A (Var02Test var02Test){
        this.var02Test = var02Test ;
    }
    @Override
    public void run() {
        var02Test.change("my","name");
    }
}
class VarThread02B extends Thread {
    Var02Test var02Test = new Var02Test ();
    public VarThread02B (Var02Test var02Test){
        this.var02Test = var02Test ;
    }
    @Override
    public void run() {
        var02Test.change("you","age");
    }
}
class Var02Test {
    public String key = "cicada" ;
    public String value = "smile" ;
    public synchronized void change (String key,String value){
        try {
            this.key = key ;
            Thread.sleep(2000);
            this.value = value ;
            System.out.println("key="+key+";value="+value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void readValue (){
        System.out.println("读取：key="+key+";value="+value);
    }
}
package com.func.program.block02lambda;

public class Lambda03 {
    public String hello = "Hello:";

    interface MsgLambda {
        void sayMsg(String message);
    }
    public static void main(String args[]){
        Lambda03 lambda03 = new Lambda03() ;
        lambda03.test01();
    }
    public void test01 (){
        final int num = 1 ;
        MsgLambda msgLambda = message ->
                System.out.println(hello + message+";"+(num+1));
        msgLambda.sayMsg("world");
    }
}

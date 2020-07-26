package com.data.type.block03process;

/**
 * Return 语句
 */
public class Process06 {
    public static void main(String[] args) {
        System.out.println(getNum1());
        System.out.println(getNum2());
    }
    public static int getNum1 (){
        int a =100;
        try{
            return a+1;   // 这里是运算逻辑，非赋值
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            return a;
        }
    }
    public static int getNum2 (){
        int a =100;
        try{
            return a++;   //  a++ -> a=a+1 此时a的值改变
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            return a;
        }
    }
}
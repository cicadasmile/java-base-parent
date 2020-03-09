package com.data.type.block01base;

public class IntType07 {
    public static void main(String[] args) {
        // float 声明
        float f1 = 12.3f ;
        // double 声明
        double d1 = 13.4 ;
        // 向下转型，需要强制转换
        float f2 = (float) d1 ;
        System.out.println("f1="+f1+";d1="+d1+";f2="+f2);
    }
}

package com.data.type.block01base;


public class IntType02 {
    public static void main(String[] args) {
        // 自动转换
        int i = 112 ;
        long j = i ;
        System.out.println(j);
        // 强制转换
        double d = 13.14 ;
        int f = (int)d;
        System.out.println(f);
        // 类型提升
        long r = i * j ;
        System.out.println(r);
    }
}

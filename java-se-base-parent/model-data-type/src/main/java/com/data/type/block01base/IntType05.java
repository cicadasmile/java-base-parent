package com.data.type.block01base;

public class IntType05 {
    public static void main(String[] args) {
        short s1 = 1 ;
        // s1 = s1 + 1 ; // 变异错误：s1自动向int类型转换
        s1 += 1 ;
        System.out.println(s1);
    }
}

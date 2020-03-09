package com.data.type.block01base;

public class IntType06 {
    public static void main(String[] args) {
        // 存在精度损失问题：0.30000000000000004
        System.out.println(3*0.1);
        // true
        System.out.println(0.3 == 0.3);
        // false
        System.out.println(3*0.1 == 0.3);
    }
}

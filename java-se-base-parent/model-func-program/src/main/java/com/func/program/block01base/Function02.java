package com.func.program.block01base;

public class Function02 {
    public static void main(String[] args) {
        // 函数式计算
        System.out.println("func01 = "+func01(2,3,4));
    }
    private static int func01 (int x,int y,int c){
        return (x+y)*c;
    }
}

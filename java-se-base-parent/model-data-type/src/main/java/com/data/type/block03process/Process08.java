package com.data.type.block03process;

/**
 * Continue 语句
 */
public class Process08 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 3 ; i++){
            if (i == 1){
                continue ;
            }
            System.out.println("i = " + i);
        }
    }
}

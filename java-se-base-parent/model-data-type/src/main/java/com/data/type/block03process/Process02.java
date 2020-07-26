package com.data.type.block03process;

/**
 * else...if 语句
 */
public class Process02 {
    public static void main(String[] args) {
        elseIf(11) ;
        elseIf(9) ;
        elseIf(5);
    }

    private static void elseIf (Integer num){
        if (num > 10){
            System.out.println("num > 10");
        } else if (num > 7){
            System.out.println("num > 7");
        } else if (num > 4){
            System.out.println("num > 4");
        } else {
            System.out.println("num < 4");
        }
    }
}

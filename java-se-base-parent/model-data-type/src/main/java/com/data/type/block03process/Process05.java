package com.data.type.block03process;

/**
 * while 和 do while
 */
public class Process05 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        // while循环
        while(num1 <= 3) {
            System.out.println("num1 == " + num1);
            num1++;
        }

        // do...while循环
        do {
            System.out.println("num2 == " + num2);
            num2++;
        } while(num2 <= 3);
    }
}

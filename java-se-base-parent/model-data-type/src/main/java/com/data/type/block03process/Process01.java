package com.data.type.block03process;

/**
 * if...else 流程控制
 */
public class Process01 {
    public static void main(String[] args) {
        // 演示：Node01
        if (compare01(40,30)){
            System.out.println("40>30:true");
        } else {
            System.out.println("40>30:false");
        }
        // 演示：Node02
        if (compare01(10,20) && compare01(20,30)){
            System.out.println("条件成立");
        } else {
            System.out.println("条件不成立");
        }
        // 演示：Node03
        if (compare01(20,10) || compare01(20,30)){
            System.out.println("条件成立");
        } else {
            System.out.println("条件不成立");
        }
        // 演示：Node04
        if(compare02(1,1))
            if(compare02(2,2))
                System.out.println("Running...");
        // 演示：Node05
        if(compare01(1,2))
            if(compare01(5,3)){
                System.out.println("5>3");
            }
    }

    private static boolean compare01 (int num1,int num2){
        System.out.println("判断：num1="+num1+";num2="+num2);
        return num1 > num2 ;
    }
    private static boolean compare02 (int num1,int num2){
        System.out.println("判断：num1="+num1+";num2="+num2);
        return num1 == num2 ;
    }
}

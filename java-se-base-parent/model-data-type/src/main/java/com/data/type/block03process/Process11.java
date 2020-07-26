package com.data.type.block03process;

/**
 * 递归算法
 */
public class Process11 {
    public static void main(String[] args) {
        System.out.println(getSumOne(100));
        System.out.println(getSumTwo(30));
        System.out.println(getSumThree(5));
    }
    /**
     * 使用递归的方式计算1+2+...+100
     */
    public static int getSumOne (int i){ // 传入100
        int sum ;
        if (i == 1){
            return 1 ;
        }
        else {
            sum = i + getSumOne(i - 1) ;
        }
        return sum ;
    }
    /**
     * 一列数的规则如下: 1、1、2、3、5、8、13、21、34...
     * 求第30位数是多少， 用递归算法实现
     */
    public static int getSumTwo (int i){ // 传入第几位数下标
        if (i <= 0){
            return 0 ;
        } else if (i == 1 || i == 2){ // 处理前面2位的1,1
            return 1 ;
        } else { // 当前位数是前两位之和
            return getSumTwo(i - 1) + getSumTwo(i - 2) ;
        }
    }
    /**
     * 1*2*3*...*100 递归计算阶乘
     */
    public static int getSumThree (int i){
        if (i == 1){
            return i ;
        } else {
            return i * getSumThree (i - 1) ;
        }
    }
}

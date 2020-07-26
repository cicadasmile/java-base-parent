package com.data.type.block03process;

/**
 * 排列组合
 */
public class Process10 {
    public static void main(String[] args) {
        arrange() ;
    }
    /**
     * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
     */
    public static void arrange (){
        int i=0; // 百位数
        int j=0; // 十位数
        int k=0; // 个位数
        int t=0; // 计数器
        for (i = 1 ; i <= 4 ; i++){
            for (j = 1 ; j <= 4 ; j++){
                for (k = 1 ; k <=4 ; k++){
                    if (i != j && j != k && k != i){
                        t += 1 ;
                        System.out.print(i*100+j*10+k+"--");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("t="+t);
    }
}

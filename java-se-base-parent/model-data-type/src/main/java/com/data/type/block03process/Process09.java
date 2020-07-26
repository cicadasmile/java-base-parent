package com.data.type.block03process;

public class Process09 {
    public static void main(String[] args) {
        int[] score = {9,8,7,6,5} ;
        // 排序次数：最多 length - 1 次
        for (int i = 0 ; i < score.length -1 ; i ++){
            // 当前排序的集合区间,排序完一个数据就放弃一个
            for (int j = 0 ; j < score.length - i - 1 ; j++){
                // 冒泡排序：把结果大的向后扔
                if (score[j] > score[j+1]){
                    int temp = score[j] ;
                    score[j] = score[j+1] ;
                    score[j+1] = temp ;
                }
            }
        }
        // 输出排序后的结果集
        for (int i = 0 ; i < score.length ; i++){
            System.out.print(score[i]);
        }
    }
}

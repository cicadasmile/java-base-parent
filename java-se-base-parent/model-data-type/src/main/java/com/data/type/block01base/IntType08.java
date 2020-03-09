package com.data.type.block01base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntType08 {
    public static void main(String[] args) {
        BigDecimal dec1 = new BigDecimal(3.0) ;
        BigDecimal dec2 = new BigDecimal(2.11) ;
        // 精确加法运算
        BigDecimal res1 = dec1.add(dec2) ;
        System.out.println(res1);
        // 精确减法运算，并截取结果
        // HALF_UP：四舍五入
        BigDecimal res2 = dec1.subtract(dec2);
        System.out.println(res2.setScale(1, RoundingMode.HALF_UP));
        // 精确乘法运算
        BigDecimal res3 = dec1.multiply(dec2) ;
        System.out.println(res3.doubleValue());
        // 精确除法运算，并截取结果
        // ROUND_DOWN：直接按保留位数截取
        BigDecimal res4 = dec1.divide(dec2,2,BigDecimal.ROUND_DOWN);
        System.out.println(res4);
    }
}

package com.data.type.block02string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class String04 {
    public static void main(String[] args) {
        // 指定位置拼接字符串
        String var1 = formatStr("cicada","smile");
        System.out.println("var1="+var1);
        // 格式化日期：2020-03-07
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date() ;
        System.out.println(format.format(date));
        // 浮点数：此处会四舍五入
        double num = 3.14159;
        System.out.print(String.format("浮点类型：%.3f %n", num));
    }
    public static String formatStr (String ...var){
        return String.format("key:%s:route:%s",var);
    }
}

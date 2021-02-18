package com.date.time.block01date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime03 {
    public static void main(String[] args) throws Exception {
        // 默认转换
        DateFormat dateFormat01 = new SimpleDateFormat() ;
        String nowDate01 = dateFormat01.format(new Date()) ;
        System.out.println("nowDate01="+nowDate01);
        // 指定格式转换
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat dateFormat02 = new SimpleDateFormat(format);
        String nowDate02 = dateFormat02.format(new Date()) ;
        System.out.println("nowDate02="+nowDate02);
        // 解析时间
        String parse = "yyyy-MM-dd HH:mm";
        SimpleDateFormat dateFormat03 = new SimpleDateFormat(parse);
        Date parseDate = dateFormat03.parse("2021-01-18 16:59:59") ;
        System.out.println("parseDate="+parseDate);
    }
}

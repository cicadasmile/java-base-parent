package com.date.time.block01date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime05 {
    public static void main(String[] args) {
        // 日期：年-月-日
        System.out.println(LocalDate.now());
        // 时间：时-分-秒-毫秒
        System.out.println(LocalTime.now());
        // 日期时间：年-月-日 时-分-秒-毫秒
        System.out.println(LocalDateTime.now());
        // 日期节点获取
        LocalDate localDate = LocalDate.now();
        System.out.println("[" + localDate.getYear() +
                "年]；[" + localDate.getMonthValue() +
                "月]；[" + localDate.getDayOfMonth()+"日]");
        // 计算方法
        System.out.println("1年后：" + localDate.plusYears(1));
        System.out.println("2月前：" + localDate.minusMonths(2));
        System.out.println("3周后：" + localDate.plusWeeks(3));
        System.out.println("3天前：" + localDate.minusDays(3));

        // 时间比较
        LocalTime localTime1 = LocalTime.of(12, 45, 45); ;
        LocalTime localTime2 = LocalTime.of(16, 30, 30); ;
        System.out.println(localTime1.isAfter(localTime2));
        System.out.println(localTime2.isAfter(localTime1));
        System.out.println(localTime2.equals(localTime1));

        // 日期和时间格式
        LocalDateTime localDateTime = LocalDateTime.now() ;
        LocalDate myLocalDate = localDateTime.toLocalDate();
        LocalTime myLocalTime = localDateTime.toLocalTime();
        System.out.println("日期：" + myLocalDate);
        System.out.println("时间：" + myLocalTime);
    }
}

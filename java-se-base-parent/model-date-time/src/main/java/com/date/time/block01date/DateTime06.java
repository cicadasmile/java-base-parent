package com.date.time.block01date;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DateTime06 {
    public static void main(String[] args) {
        // 精确到毫秒级别
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
        System.out.println(Calendar.getInstance().getTime().getTime());
        System.out.println(LocalDateTime.now().toInstant(
                ZoneOffset.of("+8")).toEpochMilli());
    }
}

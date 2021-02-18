package com.date.time.block01date;

import java.util.Date;

public class DateTime02 {
    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println("年:"+nowDate.getYear());
        System.out.println("月:"+nowDate.getMonth());
        System.out.println("日:"+nowDate.getDay());
    }
}

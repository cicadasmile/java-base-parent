package com.date.time.block01date;

public class DateTime01 {
    public static void main(String[] args) {
        long nowTime = System.currentTimeMillis() ;
        java.util.Date data01 = new java.util.Date(nowTime);
        java.sql.Date date02 = new java.sql.Date(nowTime);
        System.out.println(data01);
        System.out.println(date02.getTime());
    }
}

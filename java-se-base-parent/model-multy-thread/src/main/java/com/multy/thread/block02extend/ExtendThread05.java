package com.multy.thread.block02extend;

import java.util.concurrent.TimeUnit;

public class ExtendThread05 {
    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<>() ;
    private static void initBegin (){
        threadLocal.set(System.currentTimeMillis());
    }
    private static Long overTime (){
        return System.currentTimeMillis()-threadLocal.get();
    }
    public static void main(String[] args) throws Exception {
        ExtendThread05.initBegin();
        TimeUnit.SECONDS.sleep(3);
        System.out.println(ExtendThread05.overTime());
    }
}

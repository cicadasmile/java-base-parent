package com.multy.thread.block01create;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 线程创建方式六：线程池
 */
public class CreateThread06 {
    public static void main(String[] args) {
        Executor threadPool = Executors.newFixedThreadPool(5);
        for(int i = 0 ;i < 5 ; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}

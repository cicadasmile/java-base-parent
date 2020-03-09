package com.multy.thread.block01create;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 线程创建方式五：定时任务
 */
public class CreateThread05 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("延迟1s,每隔3s执行一次");
            }
        }, 1000, 3000);
    }
}

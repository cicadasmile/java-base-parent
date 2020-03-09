package com.multy.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 多线程入门案例
 */
public class HelloThread {
    public static void main(String[] args) {
        System.out.println("Hello,Thread");
        // 当前线程名称
        System.out.println(Thread.currentThread().getName());
        // 线程系统的管理接口
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadMXBean.getAllThreadIds() ;
        for (long id : threadIds) {
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(id) ;
            System.out.println(threadInfo.getThreadId()+
                    ":"+threadInfo.getThreadName());
        }
    }
}

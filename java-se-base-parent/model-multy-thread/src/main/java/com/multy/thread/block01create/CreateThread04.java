package com.multy.thread.block01create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 线程创建方式四：返回值线程
 */
public class CreateThread04 {
    public static void main(String[] args) throws Exception {
        MyThread4 myThread4 = new MyThread4();
        FutureTask<Integer> task = new FutureTask<>(myThread4);
        Thread thread = new Thread(task,"TaskThread");
        thread.start();
        // 等待获取结果
        // Integer result = task.get();
        // 设置获取结果的等待时间，超时抛出：TimeoutException
        Integer result = task.get(3, TimeUnit.SECONDS) ;
        System.out.println("result="+result);
    }
}
class MyThread4 implements Callable<Integer> {
    // 封装线程执行的任务
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
        return 2+3;
    }
}
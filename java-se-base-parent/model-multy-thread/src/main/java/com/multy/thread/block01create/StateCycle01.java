package com.multy.thread.block01create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 线程状态和周期
 */
public class StateCycle01 {
    public static void main(String[] args) throws Exception {
        // 进入初始状态
        StateThread01 stateThread01 = new StateThread01();
        FutureTask<String> task = new FutureTask<>(stateThread01);
        Thread thread = new Thread(task,"GetValueThread");
        // 运行状态
        thread.start();
        // 超时等待结果
        String result = task.get(3, TimeUnit.SECONDS) ;
        System.out.println("result="+result);

        StateThread02 stateThread02 = new StateThread02() ;
        Thread thread1 = new Thread(stateThread02,"WaitThread");
        thread1.start();
    }
}
class StateThread01 implements Callable<String> {
    @Override
    public String call() throws Exception {
        // 超时等待
        Thread.sleep(1000);
        return "Hello,Cicada";
    }
}
class StateThread02 implements Runnable {
    @Override
    public void run() {
        synchronized (StateCycle01.class) {
            System.out.println("进入线程...");
            try {
                // 等待状态，放弃对象锁
                StateCycle01.class.wait(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("线程继续...");
        }
    }
}
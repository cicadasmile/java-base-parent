package com.multy.thread.block02extend;

public class ExtendThread02 {
    public static void main(String[] args) {
        StopThread stopThread = new StopThread() ;
        stopThread.start();
        // 标记当前线程停止信号，且抛出中断异常，但没有停止
        stopThread.interrupt();
        // 判断当前线程是否已经是终止状态
        System.out.println("1=="+stopThread.isInterrupted());
        // 清除当前线程的终止信号,并判断执行该方法的线程(main)是否中断
        System.out.println("2=="+stopThread.interrupted());
        // 再次判断当前线程状态
        System.out.println("3=="+stopThread.isInterrupted());
        System.out.println("main end ...");
    }
}
class StopThread extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            try {
                System.out.println(Thread.currentThread().getId()+"="+i);
                // 线程阻塞1秒
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
package com.multy.thread.block04notify;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NotifyThread01 {

    static Object lock = new Object() ;
    static volatile List<String> dataList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Thread saveThread = new Thread(new SaveData(),"SaveData");
        saveThread.start();
        TimeUnit.SECONDS.sleep(3);
        Thread dataThread = new Thread(new AnalyData(),"AnalyData");
        dataThread.start();
    }

    // 等待数据生成，保存
    static class SaveData implements Runnable {
        @Override
        public void run() {
            synchronized (lock){
                while (dataList.size()==0){
                    try {
                        System.out.println(Thread.currentThread().getName()+"等待...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("SaveData .."+ dataList.get(0)+dataList.get(1));
            }
        }
    }
    // 生成数据，通知保存
    static class AnalyData implements Runnable {
        @Override
        public void run() {
            synchronized (lock){
                dataList.add("hello,");
                dataList.add("java");
                lock.notify();
                System.out.println("AnalyData End...");
            }
        }
    }
}

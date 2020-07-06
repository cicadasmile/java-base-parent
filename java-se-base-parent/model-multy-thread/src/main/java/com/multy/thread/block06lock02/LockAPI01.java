package com.multy.thread.block06lock02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAPI01 {

    private static Lock lock = new ReentrantLock() ;
    private static Condition condition1 = lock.newCondition() ;
    private static Condition condition2 = lock.newCondition() ;

    public static void main(String[] args) throws Exception {
        List<String> dataList = new ArrayList<>() ;
        ReadList readList = new ReadList(dataList);
        WriteList writeList = new WriteList(dataList);
        new Thread(readList).start();
        TimeUnit.SECONDS.sleep(2);
        new Thread(writeList).start();
    }
    // 读数据线程
    static class ReadList implements Runnable {
        private List<String> dataList ;
        public ReadList (List<String> dataList){
            this.dataList = dataList ;
        }
        @Override
        public void run() {
            lock.lock();
            try {
                if (dataList.size() != 2){
                    System.out.println("Read wait...");
                    condition1.await();
                }
                System.out.println("ReadList WakeUp...");
                for (String element:dataList){
                    System.out.println("ReadList："+element);
                }
                condition2.signalAll();
            } catch (InterruptedException e){
                e.fillInStackTrace() ;
            } finally {
                lock.unlock();
            }
        }
    }
    // 写数据线程
    static class WriteList implements Runnable {
        private List<String> dataList ;
        public WriteList (List<String> dataList){
            this.dataList = dataList ;
        }
        @Override
        public void run() {
            lock.lock();
            try {
                dataList.add("Java") ;
                dataList.add("C++") ;
                condition1.signalAll();
                System.out.println("Write over...");
                condition2.await();
                System.out.println("Write WakeUp...");
            } catch (InterruptedException e){
                e.fillInStackTrace() ;
            } finally {
                lock.unlock();
            }
        }
    }
}
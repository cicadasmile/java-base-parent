package com.multy.thread.block06lock02;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockAPI03 {
    public static void main(String[] args) throws Exception {
        DataMap dataMap = new DataMap() ;
        Thread read = new Thread(new GetRun(dataMap)) ;
        Thread write = new Thread(new PutRun(dataMap)) ;
        write.start();
        Thread.sleep(2000);
        read.start();
    }
}
class GetRun implements Runnable {
    private DataMap dataMap ;
    public GetRun (DataMap dataMap){
        this.dataMap = dataMap ;
    }
    @Override
    public void run() {
        System.out.println("GetRun："+dataMap.get("myKey"));
    }
}
class PutRun implements Runnable {
    private DataMap dataMap ;
    public PutRun (DataMap dataMap){
        this.dataMap = dataMap ;
    }
    @Override
    public void run() {
        dataMap.put("myKey","myValue");
    }
}
class DataMap {
    Map<String,String> dataMap = new HashMap<>() ;
    ReadWriteLock rwLock = new ReentrantReadWriteLock() ;
    Lock readLock = rwLock.readLock() ;
    Lock writeLock = rwLock.writeLock() ;

    // 读取数据
    public String get (String key){
        readLock.lock();
        try{
            return dataMap.get(key) ;
        } finally {
            readLock.unlock();
        }
    }
    // 写入数据
    public void put (String key,String value){
        writeLock.lock();
        try{
            dataMap.put(key,value) ;
            System.out.println("执行写入结束...");
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Exception...");
        } finally {
            writeLock.unlock();
        }
    }
}
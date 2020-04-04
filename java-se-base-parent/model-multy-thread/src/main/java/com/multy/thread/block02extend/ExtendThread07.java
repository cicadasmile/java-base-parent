package com.multy.thread.block02extend;

public class ExtendThread07 {
    public static void main(String[] args) {
        TryThread tryThread = new TryThread();
        tryThread.setName("try-name");
        // 定义运行中异常处理策略
        MyExe myExe = new MyExe() ;
        tryThread.setUncaughtExceptionHandler(myExe);
        tryThread.start();
    }
}
class TryThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // 如何处理这里异常？
        Integer.parseInt("cicada") ;
    }
}
class MyExe implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName()+"；异常："+e.getMessage());
    }
}
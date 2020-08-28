package com.multy.thread.block08executor;
import java.util.concurrent.*;

public class Executor01 {
    // 定义线程池
    private static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                    3,10,5000,TimeUnit.SECONDS,
                    new SynchronousQueue<>(),Executors.defaultThreadFactory(),new ExeHandler());
    public static void main(String[] args) {
        for (int i = 0 ; i < 100 ; i++){
            poolExecutor.execute(new PoolTask(i));
            //带返回值：poolExecutor.submit(new PoolTask(i));
        }
    }
}
// 定义线程池任务
class PoolTask implements Runnable {

    private int numParam;

    public PoolTask (int numParam) {
        this.numParam = numParam;
    }
    @Override
    public void run() {
        try {
            System.out.println("PoolTask "+ numParam+" begin...");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getNumParam() {
        return numParam;
    }
    public void setNumParam(int numParam) {
        this.numParam = numParam;
    }
}
// 定义异常处理
class ExeHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor executor) {
        System.out.println("ExeHandler "+executor.getCorePoolSize());
        executor.shutdown();
    }
}
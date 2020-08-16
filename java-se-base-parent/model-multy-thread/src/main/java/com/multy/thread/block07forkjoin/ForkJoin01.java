package com.multy.thread.block07forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoin01 {

    public static void main (String[] args) {
        int[] numArr = new int[100];
        for (int i = 0; i < 100; i++) {
            numArr[i] = i + 1;
        }
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> forkJoinTask =
                pool.submit(new SumTask(numArr, 0, numArr.length));
        System.out.println("合并计算结果: " + forkJoinTask.invoke());
        pool.shutdown();
    }
}
/**
 * 线程任务
 */
class SumTask extends RecursiveTask<Integer> {
    /*
     * 切分任务块的阈值
     * 如果THRESHOLD=100
     * 输出：main【求和：(0...100)=5050】 合并计算结果: 5050
     */
    private static final int THRESHOLD = 100;
    private int arr[];
    private int start;
    private int over;

    public SumTask(int[] arr, int start, int over) {
        this.arr = arr;
        this.start = start;
        this.over = over;
    }

    // 求和计算
    private Integer sumCalculate () {
        Integer sum = 0;
        for (int i = start; i < over; i++) {
            sum += arr[i];
        }
        String task = "【求和：(" + start + "..." + over + ")=" + sum +"】";
        System.out.println(Thread.currentThread().getName() + task);
        return sum ;
    }

    @Override
    protected Integer compute() {
        if ((over - start) <= THRESHOLD) {
            return sumCalculate();
        }else {
            int middle = (start + over) / 2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, over);
            left.fork();
            right.fork();
            return left.join() + right.join();
        }
    }
}
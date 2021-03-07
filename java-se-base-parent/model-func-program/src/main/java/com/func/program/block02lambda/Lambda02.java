package com.func.program.block02lambda;

public class Lambda02 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(i);
                }
            }
        }).start();
        // 对比 Lambda 方式
        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println(i);
            }
        }).start();
    }
}

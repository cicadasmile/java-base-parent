package com.func.program.block02lambda;

public class Lambda04 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("run one...");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

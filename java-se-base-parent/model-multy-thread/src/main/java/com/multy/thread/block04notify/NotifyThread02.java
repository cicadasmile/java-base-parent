package com.multy.thread.block04notify;

import java.io.*;

public class NotifyThread02 {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        // 链接输入流和输出流
        pos.connect(pis);
        // 写数据线程
        new Thread(new Runnable() {
            public void run() {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                // 将从键盘读取的数据写入管道流
                PrintStream ps = new PrintStream(pos);
                while (true) {
                    try {
                        System.out.print(Thread.currentThread().getName());
                        ps.println(br.readLine());
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "输入数据线程：").start();
        // 读数据线程
        new Thread(new Runnable() {
            public void run() {
                BufferedReader br = new BufferedReader(new InputStreamReader(pis));
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "输出数据线程：").start();
    }
}
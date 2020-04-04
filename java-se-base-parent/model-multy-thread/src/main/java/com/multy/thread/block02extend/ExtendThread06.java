package com.multy.thread.block02extend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class ExtendThread06 {
    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String value = br.readLine();
        CheckThread checkThread = new CheckThread(value) ;
        checkThread.setDaemon(true);
        checkThread.start();
    }
}
class CheckThread extends Thread {
    private String spell ;
    public CheckThread (String spell){
        this.spell = spell ;
    }
    @Override
    public void run() {
        if (spell.startsWith("cs")){
            System.out.println(spell+"：输入正确");
        } else {
            System.out.println(spell+"：输入错误");
        }
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
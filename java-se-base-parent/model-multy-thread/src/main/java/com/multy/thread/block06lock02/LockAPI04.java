package com.multy.thread.block06lock02;

import java.util.concurrent.locks.LockSupport;

public class LockAPI04 {
    public static void main(String[] args) throws Exception {
        OrderPay orderPay = new OrderPay("UnPaid") ;
        Thread orderThread = new Thread(orderPay) ;
        orderThread.start();
        Thread.sleep(3000);
        orderPay.changeState("Pay");
        LockSupport.unpark(orderThread);
    }
}
class OrderPay implements Runnable {
    // 支付状态
    private String orderState ;
    public OrderPay (String orderState){
        this.orderState = orderState ;
    }
    public synchronized void changeState (String orderState){
        this.orderState = orderState ;
    }
    @Override
    public void run() {
        if (orderState.equals("UnPaid")){
            System.out.println("订单待支付..."+orderState);
            LockSupport.park(orderState);
        }
        System.out.println("orderState="+orderState);
        System.out.println("订单准备发货...");
    }
}
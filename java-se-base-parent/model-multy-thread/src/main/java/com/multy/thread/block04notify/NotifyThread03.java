package com.multy.thread.block04notify;

public class NotifyThread03 {
    public static void main(String[] args) {
        Product product = new Product();
        ProductFactory productFactory = new ProductFactory(product);
        ProductShop productShop = new ProductShop(product);
        productFactory.start();
        productShop.start();
    }
}
// 产品
class Product {
    public String name ;
    public double price ;
    // 产品是否生产完毕,默认没有
    boolean flag ;
}
// 产品工厂：生产
class ProductFactory extends Thread {
    Product product ;
    public ProductFactory (Product product){
        this.product = product;
    }
    @Override
    public void run() {
        int i = 0 ;
        while (i < 20) {
            synchronized (product) {
                if (!product.flag){
                    if (i%2 == 0){
                        product.name = "鼠标";
                        product.price = 79.99;
                    } else {
                        product.name = "键盘";
                        product.price = 89.99;
                    }
                    System.out.println("产品："+product.name+"【价格："+product.price+"】出厂...");
                    product.flag = true ;
                    i++;
                    // 通知消费者
                    product.notifyAll();
                } else {
                    try {
                        // 进入等待状态
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
// 产品商店：销售
class ProductShop extends Thread {
    Product product ;
    public ProductShop (Product product){
        this.product = product ;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                if (product.flag == true ){
                    System.out.println("产品:"+product.name+"【价格"+(product.price*2)+"】卖出...");
                    product.flag = false ;
                    product.notifyAll(); //唤醒生产者
                } else {
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
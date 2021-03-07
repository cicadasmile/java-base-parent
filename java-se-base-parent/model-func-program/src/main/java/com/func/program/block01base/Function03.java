package com.func.program.block01base;

public class Function03 {
    public static void main(String[] args) {
        Func03 func03 = new Func03();
        func03.add(2);
        System.out.println(func03.res1);
    }
}
class Func03 {
    public int res1 = 0 ;
    public void add (int a1){
        this.res1 = a1 +1 ;
    }
}

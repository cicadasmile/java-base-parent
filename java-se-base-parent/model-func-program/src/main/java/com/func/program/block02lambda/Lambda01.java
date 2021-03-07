package com.func.program.block02lambda;

public class Lambda01 {
    interface LambdaOpera {
        int operation(int a, int b);
    }
    public static void main(String[] args) {
        LambdaOpera lambdaOpera = new LambdaOpera(){
            @Override
            public int operation(int a, int b) {
                return a * b ;
            }
        };
        System.out.println(lambdaOpera.operation(3,2));
        LambdaOpera lambdaOpera01 = (int a, int b) -> a + b;
        LambdaOpera lambdaOpera02 = (int a, int b) -> a - b;
        System.out.println(lambdaOpera01.operation(3,2));
        System.out.println(lambdaOpera02.operation(3,2));
    }
}

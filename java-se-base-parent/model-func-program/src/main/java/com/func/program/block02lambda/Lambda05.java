package com.func.program.block02lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda05 {
    public static void main(String[] args) {
        Function<Integer, Integer> function01 = x -> x * 2;
        System.out.println(function01.apply(2));
        BiFunction<Integer, Integer, Integer> function02 = (x, y) -> x * y;
        System.out.println(function02.apply(2, 3));

        Consumer<String> consumer01 = msg -> System.out.println("msg:"+msg);
        consumer01.accept("hello");

        BiConsumer<String,Integer> consumer02 = (msg,i)
                -> System.out.println(msg+":"+i);
        consumer02.accept("world",3);
    }
}

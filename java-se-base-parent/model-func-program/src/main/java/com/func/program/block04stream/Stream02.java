package com.func.program.block04stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        // 1、转换Stream
        List<String> list = Arrays.asList("java+；", "c++；", "net；");
        list.stream();
        // 2、forEach操作
        list.stream().forEach(System.out::print);
        // 3、map映射，输出 3，4
        IntStream.rangeClosed(2,3).map(x->x+1).forEach(System.out::println);
        // 4、filter过滤
        list.stream().filter(str -> str.contains("+")).forEach(System.out::print);
        // 5、distinct去重
        Integer[] arr = new Integer[]{3, 1, 3, 1, 2,4};
        Stream.of(arr).distinct().forEach(System.out::println);
        // 6、sorted排序
        Stream.of(arr).sorted().forEach(System.out::println);
        // 7、collect转换
        List<String> newList = list.stream().filter(str -> str.contains("+"))
                .collect(Collectors.toList());
        newList.stream().forEach(System.out::print);
    }
}

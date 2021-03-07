package com.func.program.block04stream;

import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "java");
        stream.forEach(str -> System.out.print(str+";"));
    }
}

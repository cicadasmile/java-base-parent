package com.func.program.block03optional;

import java.util.Optional;

public class Optional04 {
    public static void main(String[] args) {
        // 1、map转换方法
        User user = new User(99, "Java");
        // user = null ;
        String name = Optional.ofNullable(user)
                .map(u -> u.getName()).orElse("c++");
        System.out.println(name);
        // 2、过滤方法
        Optional<User> optUser01 = Optional.ofNullable(user)
                .filter(u -> u.getName() != null && u.getName().contains("c++"));
        // NoSuchElementException
        System.out.println(optUser01.get().getName());
    }
}

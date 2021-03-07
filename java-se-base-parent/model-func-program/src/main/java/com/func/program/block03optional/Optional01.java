package com.func.program.block03optional;

public class Optional01 {
    public static void main(String[] args) {
        User user = new User(1,"hello") ;
        if (user != null){
            if (user.getName() != null){
                System.out.println(user.getName());
            }
        }
    }
}
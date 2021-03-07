package com.func.program.block03optional;

import java.util.Optional;

public class Optional03 {
    public static void main(String[] args) {
        User user = new User(1,"say");
        Optional<User> optionalUser = Optional.ofNullable(user);
        if (optionalUser.isPresent()){
            System.out.println(optionalUser.get().getName());
        }
        User user1 = null ;
        User createUser = Optional.ofNullable(user1).orElse(createUser());
        System.out.println(createUser.getName());
        User user2 = null ;
        Optional.ofNullable(user2).orElseThrow( ()
                -> new RuntimeException());;
    }
    public static User createUser (){
        return new User(2,"hello") ;
    }
}

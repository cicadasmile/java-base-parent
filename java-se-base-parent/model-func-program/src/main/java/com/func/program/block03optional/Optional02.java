package com.func.program.block03optional;

import java.util.Optional;

public class Optional02 {
    public static void main(String[] args) {
        // NoSuchElementException
        Optional<User> optionalUser = Optional.empty();
        optionalUser.get();
        // NullPointerException
        Optional<User> nullOpt = Optional.of(null);
        nullOpt.get();
        //Optional<User> user = Optional.ofNullable(user);
    }
}

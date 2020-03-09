package com.data.type.block02string;

import java.util.UUID;

public class String06 {
    public static void main(String[] args) {
        System.out.println(StringUtil.getUUid());
    }
}
class StringUtil {
    private StringUtil(){}
    public static String getUUid (){
        return UUID.randomUUID().toString().replace("-","");
    }
}

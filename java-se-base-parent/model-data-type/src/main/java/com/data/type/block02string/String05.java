package com.data.type.block02string;

public class String05 {
    String var1 = "hello" ;
    int[] intArr = {1,2,3};
    public static void main(String[] args) {
        String05 objStr = new String05() ;
        objStr.change(objStr.var1,objStr.intArr);
        // hello  4
        System.out.println(objStr.var1);
        System.out.println(objStr.intArr[2]);
    }
    public void change (String var1,int[] intArr){
        var1 = "world" ;
        intArr[2] = 4 ;
    }
}

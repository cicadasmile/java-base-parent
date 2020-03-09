package com.data.type.block02string;

public class String09 {
    public static void main(String[] args) {
        String var1 = new String("A");
        String var2 = new String("B");
        StringBuffer var3 = new StringBuffer("C");
        StringBuffer var4 = new StringBuffer("D");
        join(var1,var2);
        join(var3,var4);
        //A<>B
        System.out.println(var1+"<>"+var2);
        //C<>DD
        System.out.println(var3+"<>"+var4);
    }
    public static void join (String s1,String s2){
        s1 = s2 ;
        s2 = s1+s2 ;
    }
    public static void join (StringBuffer s1,StringBuffer s2){
        s1 = s2 ;
        s2 = s2.append(s1) ;
    }
}

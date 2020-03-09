package com.data.type.block02string;

public class String02 {
    public static void main(String[] args) {
        String var1 = "cicada" ;
        String var2 = "cicada" ;
        // true;true
        System.out.println((var1==var2)+";"+var1.equals(var2));
        String var3 = new String("cicada");
        String var4 = new String("cicada");
        // false;true
        System.out.println((var3==var4)+";"+var3.equals(var4));
        // false;true
        System.out.println((var1==var4)+";"+var2.equals(var4));
        String var5 = "ci"+"cada";
        // true;true
        System.out.println((var1==var5)+";"+var5.equals(var4));
        String var6 = new String02().getVar6 () ;
        // true;true
        System.out.println((var1==var6)+";"+var6.equals(var4));
    }
    public String getVar6 (){
        return "cicada" ;
    }
}

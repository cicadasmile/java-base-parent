package com.data.type.block03process;

/**
 * for 循环
 */
public class Process04 {
    public static void main(String[] args) {
        // Node01
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Node02
        String[] nameArr = {"Java","C++","C#"} ;
        for (String name:nameArr){
            System.out.println("name="+name);
        }

        // Node03
        // 输出 i = 13
        int i = 0;
        for (i++; i++ < 10; i++);
        System.out.println(++i);

        // 输出：j=3 6 9
        int j = 0;
        for (j++; j++ < 10; j++){
            System.out.println(++j);
        }
    }
}

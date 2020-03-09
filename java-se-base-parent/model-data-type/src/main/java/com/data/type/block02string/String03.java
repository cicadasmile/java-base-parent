package com.data.type.block02string;

import java.nio.charset.Charset;
import java.util.Arrays;

public class String03 {
    public static void main(String[] args) throws Exception {
        String value = "Hello,知了";
        // UTF-8
        byte[] defaultCharset = value.getBytes(Charset.defaultCharset());
        System.out.println(Arrays.toString(defaultCharset));
        System.out.println(new String(defaultCharset,"UTF-8"));
        // GBK
        byte[] gbkCharset = value.getBytes("GBK");
        System.out.println(Arrays.toString(gbkCharset));
        System.out.println(new String(gbkCharset,"GBK"));
        // ISO-8859-1：表示的字符范围很窄,无法表示中文字符，转换之后无法解码
        byte[] isoCharset = value.getBytes("ISO8859-1");
        System.out.println(Arrays.toString(isoCharset));
        System.out.println(new String(isoCharset,"ISO8859-1"));
        // UTF-16
        byte[] utf16Charset = value.getBytes("UTF-16");
        System.out.println(Arrays.toString(utf16Charset));
        System.out.println(new String(utf16Charset,"UTF-16"));
    }
}

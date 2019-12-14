package com.node04.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 创建Cookie
        Cookie cookie = new Cookie("author","cicada");
        // 设置生命周期 1小时
        cookie.setMaxAge(60*60);
        response.addCookie(cookie) ;
        response.getWriter().print("Hello:Cookie");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doPost...");
        Cookie[] cookies = request.getCookies() ;
        for (Cookie cookie:cookies){
            System.out.println("Name："+cookie.getName());
            System.out.println("Value："+cookie.getValue());
        }
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("userName") ;
        response.getWriter().print("Hello:"+userName);
    }
}

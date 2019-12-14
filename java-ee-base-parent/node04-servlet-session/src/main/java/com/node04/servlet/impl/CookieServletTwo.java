package com.node04.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 创建Cookie
        Cookie cookie = new Cookie("author","smile");
        // 设置生命周期 2小时
        cookie.setMaxAge(60*60*2);
        response.addCookie(cookie) ;
        response.getWriter().print("Hello:Cookie");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies() ;
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("author")){
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        String userName = request.getParameter("userName") ;
        response.getWriter().print("Hello:"+userName);
    }
}

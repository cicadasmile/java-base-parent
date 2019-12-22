package com.node05.servlet.impl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ListenerServletImpl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 1、获取TheContextListener初始化数据
        ServletContext servletContext = this.getServletContext() ;
        String author = String.valueOf(servletContext.getAttribute("author")) ;
        System.out.println("TheContextListener Author:"+author);
        // 2、Request属性设置
        request.setAttribute("mood","smile");
        request.setAttribute("mood","agitated");
        // 3、Session创建，1分钟失效，调用销毁
        HttpSession session = request.getSession(true) ;
        session.setAttribute("casually","casually");
        response.getWriter().print("Hello:Listener");
    }

}

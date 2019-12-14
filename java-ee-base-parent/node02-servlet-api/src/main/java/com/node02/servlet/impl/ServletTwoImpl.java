package com.node02.servlet.impl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletTwoImpl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 1、参数传递
        ServletContext servletContext = this.getServletContext() ;
        String value = String.valueOf(servletContext.getAttribute("cicada")) ;
        System.out.println("value="+value);
        // 2、获取初始化参数
        String myBlog = servletContext.getInitParameter("my-blog") ;
        System.out.println("myBlog="+myBlog);
        // 3、获取应用信息
        String servletContextName = servletContext.getServletContextName() ;
        System.out.println("servletContextName="+servletContextName);
        // 4、获取路径
        String pathOne = servletContext.getRealPath("/") ;
        String pathTwo = servletContext.getRealPath("/WEB-INF/") ;
        System.out.println("pathOne="+pathOne+";pathTwo="+pathTwo);
        response.getWriter().print("执行：doGet; value："+value);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("执行：doPost");
    }
}

package com.node01.servlet.impl;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletThreeImpl implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        servletConfig.getServletName();
        System.out.println("init 被调用...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        System.out.println("ThreadId："+Thread.currentThread().getId());
        System.out.println("service 被调用...");
        HttpServletResponse response = (HttpServletResponse)servletResponse ;
        response.getWriter().print("Servlet.Life");
    }
    // 关闭 Tomcat 服务时可以看到控制台打印
    @Override
    public void destroy() {
        System.out.println("destroy 被调用...");
    }
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig 被调用...");
        return null;
    }
    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo 被调用...");
        return null;
    }
}

package com.node01.servlet.impl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Servlet实现方式二
 */
public class ServletTwoImpl extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse)servletResponse ;
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("执行：service");
    }
}

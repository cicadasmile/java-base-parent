package com.node02.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletThreeImpl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // http://localhost:6003/servletThreeImpl?myName=cicada
        String method = request.getMethod();
        System.out.println("method="+method); // GET
        String requestURL = request.getRequestURL().toString();
        // http://localhost:6003/servletThreeImpl
        System.out.println("requestURL="+requestURL);
        String requestURI = request.getRequestURI();
        System.out.println("requestURI="+requestURI); // /servletThreeImpl
        String queryString = request.getQueryString() ;
        System.out.println("queryString="+queryString); // myName=cicada
        String myName = request.getParameter("myName");
        System.out.println("myName="+myName); // cicada
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("执行：doPost");
    }
}

package com.node03.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletOneImpl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doGet...");
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("userName") ;
        response.getWriter().print("Hello:"+userName);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doPost...");
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("userName") ;
        response.getWriter().print("Hello:"+userName);
    }
}
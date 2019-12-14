package com.node04.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SessionServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        HttpSession session = request.getSession(true) ;
        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        session.setAttribute("author","cicada");
        response.getWriter().print(
                "SessionId：" + session.getId() + "<br/>"+
                "User Author：" + session.getAttribute("author")+"<br/>"+
                "Create Time：" + dateFormat.format(createTime)+"<br/>"+
                "Last Access Time："+dateFormat.format(lastAccessTime));
    }
}

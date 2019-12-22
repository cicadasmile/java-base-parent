package com.node06.servlet.impl;

import com.node06.servlet.bean.UserInfo;
import com.node06.servlet.query.UserJdbcQuery;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JdbcServletImpl extends HttpServlet {
    /**
     * 测试
     * http://localhost:6003/jdbcServletImpl?userName=LiSi
     * 用户信息:UserInfo{userName='LiSi', userAge=22}
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName") ;
        UserInfo userInfo = UserJdbcQuery.queryUser(userName) ;
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("用户信息:"+userInfo);
    }
}

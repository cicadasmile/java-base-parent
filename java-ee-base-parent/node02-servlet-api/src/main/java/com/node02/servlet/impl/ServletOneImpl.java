package com.node02.servlet.impl;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ServletOneImpl implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        String servletName = servletConfig.getServletName() ;
        System.out.println("servletName="+servletName);
        String myName = servletConfig.getInitParameter("my-name") ;
        System.out.println("myName="+myName);
        Enumeration paramNames = servletConfig.getInitParameterNames() ;
        while (paramNames.hasMoreElements()){
            String paramKey = String.valueOf(paramNames.nextElement()) ;
            String paramValue = servletConfig.getInitParameter(paramKey) ;
            System.out.println("paramKey="+paramKey+";paramValue="+paramValue);
        }
        ServletContext servletContext = servletConfig.getServletContext() ;
        servletContext.setAttribute("cicada","smile");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

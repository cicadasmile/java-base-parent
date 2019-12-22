package com.node05.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TheContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("初始化：TheContextListener");
        ServletContext servletContext = servletContextEvent.getServletContext() ;
        servletContext.setAttribute("author","cicada");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("销毁：TheContextListener");
    }
}

package com.node05.servlet.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThePrintLogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String myName = filterConfig.getInitParameter("myName") ;
        System.out.println("myName："+myName);
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest ;
        HttpServletResponse response = (HttpServletResponse)servletResponse ;
        String name = request.getParameter("name") ;
        if (!name.equals("cicada")){
            response.getWriter().print("User Error !");
            return ;
        }
        chain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("ThePrintLogFilter destroy()");
    }
}

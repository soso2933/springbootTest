package com.coco.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author cocoLin
 * @create 2021-07-24 16:26
 */
@WebFilter(urlPatterns = "/myfilter")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----------------您已经进入过滤器-------------------");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

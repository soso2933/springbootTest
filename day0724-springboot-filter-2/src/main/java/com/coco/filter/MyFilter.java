package com.coco.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author cocoLin
 * @create 2021-07-24 16:31
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("您已经进入过滤器22");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

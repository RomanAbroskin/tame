package org.top.dzz.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.http.HttpRequest;

@Component
@Order(0)
public class ExampelFilterTwo implements Filter {

    private String tokken = "Hi";
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String toker = request.getHeader("toker");

        if(toker != null && toker.equals(tokken)){
            filterChain.doFilter(servletRequest,servletResponse);
        } else {
            response.setStatus(403);
            response.getWriter().println("Warning!!!");
        }


    }
}

package org.top.dzz.filter;

import jakarta.servlet.*;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Order(1)
public class ExampelFilter implements Filter {

    private static Logger LOGGER = Logger.getLogger(String.valueOf(ExampelFilter.class));
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       LOGGER.log(Level.INFO,"подключение к сервису удалось");
       filterChain.doFilter(servletRequest,servletResponse);

    }

}

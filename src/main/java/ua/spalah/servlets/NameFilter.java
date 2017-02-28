package ua.spalah.servlets;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kostiantyn Huliaiev
 */
public class NameFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        String name = servletRequest.getParameter("name");

        if (Character.isUpperCase(name.charAt(0))) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            PrintWriter writer = servletResponse.getWriter();
            writer.write("please start name with capital letter");
        }
    }

    @Override
    public void destroy() {}
}

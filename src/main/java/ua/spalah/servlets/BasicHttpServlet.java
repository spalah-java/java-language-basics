package ua.spalah.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

public class BasicHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("it's a get");

        PrintWriter writer = resp.getWriter();
//        String name = req.getParameter("name");
//        int n = Integer.parseInt(req.getParameter("n"));
//        writer.write("<html><body>the name is <b> ");
//        for (int i = 0; i < n; i++) {
//            writer.write(name + " ");
//        }
//        writer.write("</b></body></html>");

        resp.setHeader("Content-Type", "text/html");
//        resp.setHeader("Content-Type", "text/plain");
        writer.write("<html><body>");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            writer.write(entry.getKey() + " - " + Arrays.toString(entry.getValue()) + "\n");
        }

        String userAgent = req.getHeader("User-Agent");
        System.out.println(userAgent);

        writer.write("<span style='color:red'>");
        writer.write(userAgent);
        writer.write("</span></body></html>");

//        Enumeration<String> headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            System.out.println(headerNames.nextElement());
//        }

//        Cookie[] cookies = req.getCookies();
//        for (Cookie cookie : cookies) {
//            System.out.println("Cookie " + cookie.getName() + " : " + cookie.getValue());
//        }

//        resp.sendRedirect("http://google.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("it's a pooooost");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("it's a delete");
    }
}

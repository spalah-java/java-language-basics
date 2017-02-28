package ua.spalah.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setHeader("Content-Type", "text/plain");
//        writer.write("This is just plain text");

//        PrintWriter writer = resp.getWriter();
//        writer.write("<html><body>GET/POST response</body></html>");

        String name = req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.write("<html><body>the name is <b>" + name + "</b></body></html>");


//        Enumeration<String> headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            System.out.println(headerNames.nextElement());
//        }
//
//        Cookie[] cookies = req.getCookies();
//        for (Cookie cookie : cookies) {
//            System.out.println("Cookie " + cookie.getName() + " : " + cookie.getValue());
//        }
    }
}

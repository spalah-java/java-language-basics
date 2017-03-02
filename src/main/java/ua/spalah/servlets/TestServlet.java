package ua.spalah.servlets;


import ua.spalah.jdbc.Dog;
import ua.spalah.jdbc.Gender;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int i = new Random().nextInt();
        Dog bender = new Dog(15, "Bender", "robo-dog", Gender.MALE, 57.9);

        req.setAttribute("dog", bender);
        req.setAttribute("someNumber", i);

        req.getRequestDispatcher("/jsp/test.jsp").forward(req, resp);
//        req.getRequestDispatcher("/jsp/some.html").forward(req, resp);
    }
}

package ua.spalah.jsp.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.spalah.jsp.model.Client;
import ua.spalah.jsp.service.ClientService;

public class FindClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getSession().getServletContext();
        ClientService clientService = (ClientService) context.getAttribute("clientService");

        String idParam = req.getParameter("id");

        if (idParam != null) {
            long id = Long.parseLong(idParam);
            Client client = clientService.findClientById(id);

            req.setAttribute("client", client);
            req.getRequestDispatcher("/WEB-INF/views/client.jsp").forward(req, resp);
        } else {
            req.setAttribute("clients", clientService.findAllClients());
            req.getRequestDispatcher("/WEB-INF/views/all-clients.jsp").forward(req, resp);
        }
    }
}

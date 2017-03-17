package ua.spalah.jsp.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.spalah.jdbc.Gender;
import ua.spalah.jsp.model.Client;
import ua.spalah.jsp.service.ClientService;

public class EditClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getSession().getServletContext();
        ClientService clientService = (ClientService) context.getAttribute("clientService");

        String idParam = req.getParameter("id");

        Client client;
        if (idParam != null) {
            client = clientService.findClientById(Long.parseLong(idParam));
        } else {
            client = new Client();
        }
        req.setAttribute("client", client);
        req.getRequestDispatcher("/WEB-INF/views/edit-client.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getSession().getServletContext();
        ClientService clientService = (ClientService) context.getAttribute("clientService");

        Client client = createClient(req);
        String idParam = req.getParameter("id");

        if (idParam != null && !idParam.equals("0")) {
            client.setId(Long.parseLong(idParam));
            client = clientService.updateClient(client);
        } else {
            client = clientService.saveClient(client);
        }
//        req.setAttribute("client", client);
//        req.getRequestDispatcher("/WEB-INF/views/client.jsp").forward(req, resp);

        resp.sendRedirect("/client?id=" + client.getId());
    }

    private Client createClient(HttpServletRequest req) {
        Client client = new Client();
        String nameParam = req.getParameter("name");
        String genderParam = req.getParameter("gender");
        String balanceParam = req.getParameter("balance");

        client.setName(nameParam);
        client.setGender(Gender.valueOf(genderParam));
        client.setBalance(Double.parseDouble(balanceParam));

        return client;
    }
}

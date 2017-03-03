package ua.spalah.jsp.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ua.spalah.jdbc.Gender;
import ua.spalah.jsp.model.Client;
import ua.spalah.jsp.service.ClientService;

import static ua.spalah.jdbc.Gender.FEMALE;
import static ua.spalah.jdbc.Gender.MALE;

public class ServletContextInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ClientService clientService = new ClientService();
        initClients(clientService);

        ServletContext context = servletContextEvent.getServletContext();
        context.setAttribute("clientService", clientService);
    }

    private void initClients(ClientService clientService) {
        clientService.saveClient(createClient("Homer", MALE, 1700.00));
        clientService.saveClient(createClient("Marge", FEMALE, 2520.75));
        clientService.saveClient(createClient("Bart", MALE, 220.75));
        clientService.saveClient(createClient("Lisa", FEMALE, 320.75));
        clientService.saveClient(createClient("Maggie", FEMALE, 0.15));
        clientService.saveClient(createClient("Mr. Burns", MALE, 15000000.00));
    }

    private Client createClient(String name, Gender gender, double balance) {
        Client client = new Client();
        client.setName(name);
        client.setGender(gender);
        client.setBalance(balance);
        return client;
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {}
}

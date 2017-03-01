package ua.spalah.jsp.service;


import java.util.ArrayList;
import java.util.List;

import ua.spalah.jsp.model.Client;

public class ClientService {

    private List<Client> clients = new ArrayList<>();

    public Client saveClient(Client client) {
        client.setId(clients.size());
        clients.add(client);
        return client;
    }

    public List<Client> getAllClients(){
        return clients;
    }

    public Client findClientById(long id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }


}

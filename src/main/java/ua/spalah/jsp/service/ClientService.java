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

    public Client updateClient(Client updatedClient) {
        long id = updatedClient.getId();
        Client client = findClientById(id);

        client.setName(updatedClient.getName());
        client.setGender(updatedClient.getGender());
        client.setBalance(updatedClient.getBalance());

        return client;
    }

    public List<Client> findAllClients(){
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

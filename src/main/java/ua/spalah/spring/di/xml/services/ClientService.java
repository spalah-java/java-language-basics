package ua.spalah.spring.di.xml.services;

import ua.spalah.spring.di.xml.dao.ClientDao;

public class ClientService {

    private ClientDao clientDao;

    private OrderService orderService;

    private ItemService itemService;

    public ClientService(ClientDao clientDao, OrderService orderService, ItemService itemService) {
        this.clientDao = clientDao;
        this.orderService = orderService;
        this.itemService = itemService;
    }


    public String doSomething(String name, int score) {
        System.out.println("Hello " + name + " your score is " + score * 3);
        return "done";
    }
}

package ua.spalah.spring.di.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ua.spalah.spring.di.java.dao.ClientDao;

@Service
public class ClientService {

    private ClientDao clientDao;

    private OrderService orderService;

    private ItemService itemService;

    @Autowired
    public ClientService(@Qualifier("hibernate") ClientDao clientDao, OrderService orderService, ItemService itemService) {
        this.clientDao = clientDao;
        this.orderService = orderService;
        this.itemService = itemService;
    }


    public String doSomething(String name, int score) {
        System.out.println("Hello " + name + " your score is " + score * 3);
        return "done";
    }
}

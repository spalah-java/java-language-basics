package ua.spalah.spring.di.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ua.spalah.spring.di.java.dao.ClientDao;
import ua.spalah.spring.di.java.dao.OrderDao;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ItemService itemService;

    @Autowired
    @Qualifier("noSql")
    private ClientDao clientDao;
}

package ua.spalah.spring.di.annotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.spalah.spring.di.annotation.dao.OrderDao;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }
}

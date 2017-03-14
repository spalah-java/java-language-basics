package ua.spalah.spring.di.xml.services;

import ua.spalah.spring.di.xml.dao.OrderDao;

public class OrderService {

    private OrderDao orderDao;

    private ItemService itemService;

    public OrderService() {
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }
}

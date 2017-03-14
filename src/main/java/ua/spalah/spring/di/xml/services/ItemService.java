package ua.spalah.spring.di.xml.services;

import ua.spalah.spring.di.xml.dao.ItemDao;

public class ItemService {

    private ItemDao itemDao;

    public ItemService(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}

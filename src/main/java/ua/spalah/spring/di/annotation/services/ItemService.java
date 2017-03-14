package ua.spalah.spring.di.annotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.spalah.spring.di.annotation.dao.ItemDao;

@Component
public class ItemService {

    @Autowired
    private ItemDao itemDao;
}

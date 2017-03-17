package ua.spalah.spring.all.dao;

import java.util.List;

import ua.spalah.spring.all.models.Cat;

public interface CatDao {

    Cat save(Cat cat);

    Cat update(Cat cat);

    List<Cat> findAll();

    Cat find(long id);

    Cat findByName(String name);
}

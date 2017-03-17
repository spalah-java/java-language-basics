package ua.spalah.spring.all.services;

import java.util.List;

import ua.spalah.spring.all.models.Cat;

public interface CatService {

    Cat save(Cat cat);

    Cat update(Cat updatedCat);

    List<Cat> findAll();

    Cat findById(long id);

    Cat findByName(String name);
}

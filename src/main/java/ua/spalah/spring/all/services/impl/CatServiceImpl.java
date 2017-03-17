package ua.spalah.spring.all.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.spalah.spring.all.dao.CatDao;
import ua.spalah.spring.all.models.Cat;
import ua.spalah.spring.all.services.CatService;

@Service
@Transactional(readOnly = true)
public class CatServiceImpl implements CatService {

    @Autowired
    private CatDao catDao;

    @Override
    @Transactional
    public Cat save(Cat cat) {
        return catDao.save(cat);
    }

    @Override
    @Transactional
    public Cat update(Cat cat) {
        return catDao.update(cat);
    }

    @Override
    public List<Cat> findAll() {
        return catDao.findAll();
    }

    @Override
    public Cat findById(long id) {
        return catDao.find(id);
    }

    @Override
    public Cat findByName(String name) {
        return catDao.findByName(name);
    }
}

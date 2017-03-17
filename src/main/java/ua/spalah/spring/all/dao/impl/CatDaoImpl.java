package ua.spalah.spring.all.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.spalah.spring.all.dao.CatDao;
import ua.spalah.spring.all.models.Cat;

@Repository
public class CatDaoImpl implements CatDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Cat save(Cat cat) {
        em.persist(cat);
        return cat;
    }

    @Override
    public Cat update(Cat cat) {
        return em.merge(cat);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Cat> findAll() {
        return em.createQuery("from Cat").getResultList();
    }

    @Override
    public Cat find(long id) {
        return em.find(Cat.class, id);
    }

    @Override
    public Cat findByName(String name) {
        return (Cat) em.createQuery("from Cat where name like %:name%")
                .setParameter("name", name)
                .getSingleResult();
    }
}


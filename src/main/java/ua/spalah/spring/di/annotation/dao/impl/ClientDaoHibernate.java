package ua.spalah.spring.di.annotation.dao.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.spalah.spring.di.annotation.dao.ClientDao;

@Repository
@Qualifier("hibernate")
public class ClientDaoHibernate implements ClientDao {

}

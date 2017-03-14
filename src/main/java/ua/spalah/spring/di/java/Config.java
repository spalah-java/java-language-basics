package ua.spalah.spring.di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ua.spalah.spring.di.java.dao.ClientDao;

@Configuration
@ComponentScan(basePackages = "ua.spalah.spring.di.java")
public class Config {

    @Bean
    @Qualifier("noSql")
    public ClientDao clientDaoNoSql() {
        return new ClientDao() {
            @Override
            public String getProvider() {
                return "I'm based on NoSQL";
            }
        };
    }
}

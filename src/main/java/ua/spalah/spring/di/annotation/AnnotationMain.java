package ua.spalah.spring.di.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ua.spalah.spring.di.annotation.services.ClientService;

public class AnnotationMain {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("app-annotation.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("ua.spalah.spring.di.annotation");

        ClientService clientService = context.getBean(ClientService.class);
        clientService.doSomething("Nick", 7);
    }
}

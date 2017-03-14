package ua.spalah.spring.di.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ua.spalah.spring.di.java.services.ClientService;

public class JavaMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ClientService clientService = context.getBean(ClientService.class);
        clientService.doSomething("Nick", 7);
    }
}

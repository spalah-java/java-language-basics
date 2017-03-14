package ua.spalah.spring.di.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.spalah.spring.di.xml.services.ClientService;

public class XmlMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

//        ClientService clientService = (ClientService) context.getBean("clientService");
        ClientService clientService = context.getBean(ClientService.class);
        clientService.doSomething("Nick", 7);
    }
}

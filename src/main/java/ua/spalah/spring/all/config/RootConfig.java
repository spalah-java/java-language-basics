package ua.spalah.spring.all.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceConfig.class)
@ComponentScan("ua.spalah.spring.all.services")
public class RootConfig {

}

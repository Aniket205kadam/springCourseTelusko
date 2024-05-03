package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer computer) { // @Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(computer);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
////    @Bean(name = {"dk", "desktop1", "com"})
//    @Bean
////    @Scope(value = "prototype")
//    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
}

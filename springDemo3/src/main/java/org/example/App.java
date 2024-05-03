package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args )
    {
       //Java Based config
       ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

       Alien alien = context.getBean(Alien.class);
       System.out.println("Alien age is: " + alien.getAge());
       alien.code();


//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.compile();
//
//        System.out.println();
//
//        Desktop desktop1 = context.getBean(Desktop.class);
//        desktop1.compile();

        //xml config
/*//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien alien1 = (Alien) context.getBean("alien1");
//        System.out.println("Alien age is: " + alien1.getAge());
//        alien1.code();

//        Alien alien2 = (Alien) context.getBean("alien2");
//        System.out.println("Alien age is: " + alien2.getAge());
//        alien2.code();
//
//        Alien alien2 = (Alien) context.getBean("alien1");
//        System.out.println(alien2.age);
//        alien2.code();

//        Laptop laptop = (Laptop) context.getBean("laptop");
//        laptop.app();

//        Alien alien = (Alien) context.getBean("alien");
////        System.out.println("Alien age is: " + alien.getAge());
//        alien.code();


//        Alien alien = context.getBean("alien", Alien.class);
////        System.out.println("Alien age is: " + alien.getAge());
//        alien.code();

//        Computer computer = context.getBean(Computer.class);
//
//        Desktop desktop = context.getBean(Desktop.class);

//        Laptop laptop = (Laptop) context.getBean("laptop");

//        Laptop laptop = context.getBean("laptop", Laptop.class);*/

    }
}

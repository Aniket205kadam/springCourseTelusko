package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("21")
    private int age;
//    private Laptop laptop;

//    @Autowired
//    @Qualifier("lap")
    private Computer com;

    public Alien() {
        System.out.println("Alien object created");
    }

//    @ConstructorProperties({"age", "laptop"})
//    public Alien(int age, Laptop laptop) {
//        System.out.println("Para constructor is called..");
//        this.age = age;
//        this.com = laptop;
//    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
//        System.out.println("Setter are used by the spring");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding....");
        com.compile();
    }
}

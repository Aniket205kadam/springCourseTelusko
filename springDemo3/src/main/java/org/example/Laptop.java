package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lap")
@Scope("prototype")
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object created");
    }
    public void app() {
        System.out.println("Run the app.....");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}

package com.aniket.DifferentLayers;

import com.aniket.DifferentLayers.Model.Laptop;
import com.aniket.DifferentLayers.Services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DifferentLayersApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DifferentLayersApplication.class, args);

		Laptop laptop = context.getBean(Laptop.class);

		LaptopService service = context.getBean(LaptopService.class);

		service.addLaptop(laptop);
	}

}

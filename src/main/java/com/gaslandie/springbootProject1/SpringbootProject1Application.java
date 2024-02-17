package com.gaslandie.springbootProject1;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootProject1Application {

	public static void main(String[] args) {
		//spring context ou se trouve nos objet crée par spring
		ApplicationContext context= SpringApplication.run(SpringbootProject1Application.class, args);
		//creation d'objet service
		ProductService service = context.getBean(ProductService.class);

		List<Product> products = service.getAllProducts();
		for(Product p : products){
			System.out.println(p);
		}
	}

}

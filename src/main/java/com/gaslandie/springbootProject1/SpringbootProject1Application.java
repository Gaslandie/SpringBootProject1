package com.gaslandie.springbootProject1;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject1Application.class, args);

		ProductService service = new ProductService();

		List<Product> products = service.getAllProducts();
		for(Product p : products){
			System.out.println(p);
		}
	}

}

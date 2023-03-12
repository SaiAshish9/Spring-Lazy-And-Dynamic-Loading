package com.sai.Lazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class LazyApplication {

	@Bean("product1")
	public Product getProduct1(){
		return new Product("Product1");
	}

	@Lazy(value = false)
	@Bean("product2")
	public Product getProduct2(){
		return new Product("Product2");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LazyApplication.class, args);
		Product product1 = ctx.getBean("product1", Product.class);
		Product product2 = ctx.getBean("product2", Product.class);
		product1.name("mac");
		product2.name("ubuntu");
	}

}

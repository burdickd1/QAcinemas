package com.paul;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.paul.models.Product;
import com.paul.services.ProductService;

@SpringBootApplication
@EntityScan({"com.paul.models"})
@ComponentScan({"com.paul.controllers", "com.paul.models", "com.paul.services"})
public class SpringBootWebMvCjpaApplication implements CommandLineRunner{
	@Autowired
	private ProductService pserv;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvCjpaApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Product p = new Product();
		p.setpName("NotOrange");
		p.setPrice(3.14);
		p.setProductId(14);
		pserv.addProd(p);
	}
	
	@Bean//hibernate sessionfact bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){
		return hemf.getSessionFactory();
	}
}

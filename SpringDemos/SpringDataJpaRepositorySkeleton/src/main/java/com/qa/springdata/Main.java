package com.qa.springdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.qa.beans.Animal;
import com.qa.beans.Owner;
import com.qa.configs.SpringConfig;
import com.qa.services.JPAService;

@SpringBootApplication
@ComponentScan(basePackages={"com.qa.services"})
@EnableJpaRepositories(basePackages={"com.qa.repositories"})
@EntityScan(basePackages={"com.qa.beans"})
public class Main implements CommandLineRunner{

	@Autowired
	private JPAService jpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		ApplicationContext cont = new AnnotationConfigApplicationContext(SpringConfig.class);
		Owner o1 = (Owner)cont.getBean("o1");
		for(Animal a : o1.getAnimals()) jpaService.saveAnimal(a);
		Owner o2 = (Owner)cont.getBean("o2");
		for(Animal a : o2.getAnimals()) jpaService.saveAnimal(a);
		jpaService.saveOwners(o1,o2);
		
		
		System.out.println("Printing: "+jpaService.getAllOwners());
	}
}

package com.qa.configs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.beans.Animal;
import com.qa.beans.Owner;

@Configuration
public class SpringConfig {

	
	private Date getDate(String dateStr){
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
		} catch (ParseException e) {
			return new Date();
		}
	}
	
	//beans for five animals
	@Bean
	public Animal alpha(){
		return new Animal(0, "Alpha", "Dog", getDate("10-01-2014"));//, alice());
	}
	
	@Bean
	public Animal beta(){
		return new Animal(1, "Beta", "Dog", getDate("15-01-2014"));//, alice());
	}
	
	@Bean
	public Animal gamma(){
		return new Animal(2, "Gamma", "Cat", getDate("08-03-2008"));//, bob());
	}
	
	@Bean
	public Animal delta(){
		return new Animal(3, "Delta", "Cat", getDate("09-01-2009"));//, bob());
	}
	
	@Bean
	public Animal epsilon(){
		return new Animal(4, "Epsilon", "Rabbit", getDate("20-03-2013"));//, bob());
	}
	
	/* 4 a) Create/Configure two Owner beans,
	  each owning at least two Animal beans.
	 */
	@Bean
	public Owner o1(){
		Owner o1 = new Owner(0, "Paul", "email@stuff.go");
		Animal a = alpha();
		a.setOwnerID(o1.getOwnerID());
		o1.addAnimal(a);
		a = epsilon();
		a.setOwnerID(o1.getOwnerID());
		o1.addAnimal(a);
		return o1;
	}
	
	@Bean
	public Owner o2(){
		Owner o2 = new Owner(1, "Jon", "another@lost.com");
		Animal a = gamma();
		a.setOwnerID(o2.getOwnerID());
		o2.addAnimal(a);
		a = delta();
		a.setOwnerID(o2.getOwnerID());
		o2.addAnimal(a);
		return o2;
	}
	
}

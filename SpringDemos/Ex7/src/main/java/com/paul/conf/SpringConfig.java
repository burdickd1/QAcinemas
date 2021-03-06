package com.paul.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.paul.Owner;
import com.paul.Pet;

@Configuration
@PropertySource("classpath:my.properties")
public class SpringConfig {
	@Value("${test}")
	private String test;
	@Value("${test2}")
	private String test2;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public Pet p1(){
		System.out.println("Properties::> test:" + test + " test2:" + test2);
		Pet p1 = new Pet();
		p1.setName("Dog");
		return p1;
	}
	
	@Bean
	public Pet p2(){
		Pet p2 = new Pet();
		p2.setName("Cat");
		return p2;
	}
	
	@Bean
	public Pet p3(){
		Pet p2 = new Pet();
		p2.setName("Mouse");
		return p2;
	}
	
	@Bean
	public Pet[] petArr(){
		return new Pet[]{p1(), p2(), p3()};
	}
	
	@Bean
	public Owner o1(){
		Owner o1 = new Owner();
		o1.setName("BOB");
		o1.setPets(petArr());
		return o1;
	}
}

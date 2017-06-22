package com.paul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paul.Customer;

@Configuration
public class SpringConfig {
	
	@Bean
	public Customer c1(){
		Customer c1 = new Customer();
		c1.setId(100);
		c1.setName("NotPaul");
		c1.setEmail("1@t.com");
		return c1;
	}
}

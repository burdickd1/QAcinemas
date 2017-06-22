package com.paul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paul.config.SpringConfig;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext cont =
				new AnnotationConfigApplicationContext(SpringConfig.class);
//				new ClassPathXmlApplicationContext("spring.xml");
		Customer c = (Customer)cont.getBean("c1");
		System.out.println(c);
		
		cont = new ClassPathXmlApplicationContext("spring.xml");
		c = (Customer)cont.getBean("c1");
		System.out.println(c);
	}

}

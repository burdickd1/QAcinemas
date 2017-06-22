package com.paul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.paul.conf.SpringConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext cont = new AnnotationConfigApplicationContext(SpringConfig.class);
		Owner owner = (Owner)cont.getBean("o1");
		System.out.println(owner);
	}

}
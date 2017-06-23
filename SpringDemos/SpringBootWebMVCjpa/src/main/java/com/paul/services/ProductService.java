package com.paul.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paul.models.Product;
import com.paul.repos.ProductRepository;

@Service
public class ProductService {
//	@Autowired
//	private ProductRepository repo;
	
	@Autowired
	private SessionFactory sessionFactory;
	
//	public void addProd(Product p1){
//		repo.save(p1);
//	}
	
	public void addProd(Product p){
		
		Session ses = sessionFactory.openSession();
		Transaction trans = ses.beginTransaction();
		
		ses.save(p);
		trans.commit();
		System.out.println("Message here");
	}
}

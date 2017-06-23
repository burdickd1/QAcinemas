package com.paul.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paul.models.Product;
import com.paul.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService pServ;
	
	@RequestMapping("/")
	public String landingPage(){
		return "index";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute Product p){
		pServ.addProd(p);
		return "success";
	}
}

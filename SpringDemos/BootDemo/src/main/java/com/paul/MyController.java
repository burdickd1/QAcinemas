package com.paul;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	/*@RequestMapping("/")
	public String hello(){
		return "login";
	}*/
	
	@RequestMapping("/getObject")
	public ModelAndView createAndDispatchObject(){
		ModelAndView mav = new ModelAndView("display", "name", new String("Paul"));
		return mav;
	}
	
	@RequestMapping("/loginProcess")
	public ModelAndView loginProcess(@RequestParam("username")String username, @RequestParam("password") String password){
		if(username.equals("Paul") && password.equals("1234")){
			ModelAndView mav = new ModelAndView("success", "name", new String("Paul"));
			return mav;
		}else{
			ModelAndView mav = new ModelAndView("failure", "name", new String("Paul"));
			return mav;
		}
	}
}

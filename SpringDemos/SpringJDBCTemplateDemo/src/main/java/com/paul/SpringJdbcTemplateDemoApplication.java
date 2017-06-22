package com.paul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.paul.models.Employee;
import com.paul.serv.EmployeeService;

@SpringBootApplication
@ComponentScan({"com.paul.serv", "com.paul.models"})
public class SpringJdbcTemplateDemoApplication implements CommandLineRunner{
	@Autowired
	private EmployeeService empServ;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplateDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Employee emp = new Employee();
		emp.setFirst("Joe");
		emp.setLast("Something");
		emp.setEmail("email2@email.com");
		emp.setPswd("12345");
		
		System.out.println(empServ.addRecord(emp) + " record inserted");
		for(Employee e : empServ.getAllEmp()){
			System.out.println("Record: " + e);
		}
		
		emp.setFirst("Mark");
		
		System.out.println(empServ.updateEmp(emp) + " record updated");
		System.out.println("Single select: " + empServ.getEmp(emp));
		for(Employee e : empServ.getAllEmp()){
			System.out.println("Record: " + e);
		}
		System.out.println(empServ.deleteEmp(emp) + " record updated");
//		empServ.drop();
//		empServ.create();
		
	}
}

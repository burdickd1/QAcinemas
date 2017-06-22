package com.paul.models;

public class Person {
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String fn, String ln, String email, int age){
		firstname = fn;
		lastname = ln;
		this.email = email;
		this.age = age;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "Person: [name=" + lastname + ", " + firstname + " email=" + email + " age=" + age + "]";
	}
}

package com.paul;

import java.util.Arrays;

public class Owner {
	private String name;
	private Pet[] pets;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Pet[] getPets() {
		return pets;
	}
	
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	
	@Override
	public String toString(){
		return "[Owner name=" + name + " pets=" + Arrays.toString(pets) + "]";
	}
}

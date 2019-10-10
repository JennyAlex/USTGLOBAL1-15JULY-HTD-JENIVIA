package com.dev.encapsulation;

import java.util.HashSet;

public class Employee implements Comparable<Employee> {
	
	private String Name;
	private int age;
	private  String email;
	private String password;
	
	

@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + ", email=" + email + "]";
	}



public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



//	public String getPassword() {
//		return password;
//	}



	public void setPassword(String password) {
		this.password = password;
	}



public static void main(String[] args) {
		
}



@Override
public int compareTo(Employee e1) {

	return (this.age- e1.age);
}
}

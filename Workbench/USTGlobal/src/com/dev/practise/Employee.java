package com.dev.practise;

public class Employee {
	private String Name;
	private int Age;
	private int Id;
	private String Email;
	

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Age=" + Age + ", Id=" + Id + ", Email=" + Email + "]";
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public static void main(String[] args) {
		
		
		

	}

}

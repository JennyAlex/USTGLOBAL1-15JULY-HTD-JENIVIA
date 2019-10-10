package com.dev.encapsulation;

public class Pets implements Comparable<Pets> {    //if not implemented then class cast exception vl occur
	
	@Override
	public String toString() {
		return "Pets [type=" + type + ", age=" + age + ", breed=" + breed + ", color=" + color + ", name=" + name + "]";
	}

	private String type;
	private int age;
	private  String breed;
	private String color;
	private String name;

	public static void main(String[] args) {
		

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Pets d1) {
		
		return (this.age - d1.age);
	}

}

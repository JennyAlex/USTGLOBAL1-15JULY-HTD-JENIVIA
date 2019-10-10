package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Pets;

public class C4 {

	public static void main(String[] args) {
	
TreeSet<Pets> ts = new TreeSet<Pets>();

Pets  d1= new Pets();
d1.setAge(10);
d1.setBreed("dobberman");
d1.setColor("black");
d1.setName("Shiro");


Pets d2 = new Pets();
d2.setAge(5);
d2.setBreed("Dalmation");
d2.setColor("black n white");
d2.setName("Ronnie");

Pets d3 = new Pets();
d3.setAge(7);
d3.setBreed("Dalmation");
d3.setColor("black n white");
d3.setName("Nikkie");
	
	ts.add(d1);
	ts.add(d2);
	ts.add(d3);
	System.out.println(ts);
	
	}
	
	
	

}

package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Pets;

public class C3 {

	public static void main(String[] args) {
	HashMap<String , Pets> hm = new HashMap<String , Pets>();
	Pets  d1= new Pets();
	d1.setAge(1);
	d1.setBreed("dobberman");
	d1.setColor("black");
	d1.setName("Shiro");
	
	
	Pets d2 = new Pets();
	d2.setAge(2);
	d2.setBreed("Dalmation");
	d2.setColor("black n white");
	d2.setName("Ronnie");
	
	Pets d3 = new Pets();
	d3.setAge(2);
	d3.setBreed("Dalmation");
	d3.setColor("black n white");
	d3.setName("Nikkie");
	
	
//	hm.put("1",d1);
//	Pets b = hm.put("1", d1);    //type of value is return type
//	System.out.println(b);

	hm.put("1", d1);
	hm.put("2", d2);
	hm.put("3", d3);
	System.out.println(hm);
	
	
	Pets f = hm.remove("2");    //remove 2nd object
	System.out.println(f);
	System.out.println(hm);
	
	System.out.println("Output of continsKey(): " +hm.containsKey("3"));
	
	
	System.out.println("Output of containsValue(): " +hm.containsValue(d3));
	
	
	}

}

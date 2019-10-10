package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Pets;

public class C1 {

	public static void main(String[] args) {
	HashSet<Pets> hs = new HashSet<Pets>();
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
	
	Pets d4 = new Pets();
	d4.setAge(2);
	d4.setBreed("shitzu");
	d4.setColor("white");
	d4.setName("linnie");
	
	boolean b = hs.add(d1);           
	boolean b1= hs.add(d2);
	boolean b3 = hs.add(d3);
	System.out.println("Output of add" +b+ " " +b1+ ""  +b3);       
	System.out.println(hs);
	
	for(Pets pets : hs) {   //for each loop is itterating through collection 
		System.out.println(pets);
	}

//	System.out.println("Size of HashSet hs: "+hs.size());    //defines size 
//	boolean b2= hs.remove(d1);
//	System.out.println("The output of remove " +b2);           //removes d1
//	System.out.println(hs);
//	
//	
//	System.out.println("Output of contains(): "+hs.contains(d1));       
//	
//	
//	System.out.println("Size of HashSet hs: "+hs.size());
//	
//	
//	hs.clear();
//	System.out.println("Size of hashset after clear() : "+hs.size());
	} 

}
	
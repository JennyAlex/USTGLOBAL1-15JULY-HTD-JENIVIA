package com.dev.objectmethods;

public class PetsData {

	public static void main(String[] args) {
	 Pets d1=new Pets();
	 Pets d2=new Pets();
	 Pets d3= new Pets();
	 Pets d4=new Pets();
	 Pets d5=new Pets();
	 Pets d6= new Pets();
	 Pets d7=new Pets();
	 Pets d8=new Pets();
	 Pets d9= new Pets();
	 
	 d1.setType("Dogs");
	 d1.setAge(1);
	 d1.setBreed("Dober man");
	 d1.setColor("Black");
	 d1.setName("Shiro");
	 
	 
	 d2.setType("Dogs");
	 d2.setAge(2);
	 d2.setBreed("Shitzu");
	 d2.setColor("White");
	 d2.setName("Sammy");
	 
	 d3.setType("Dogs");
	 d3.setAge(3);
	 d3.setBreed("Dash");
	 d3.setColor("Black");
	 d3.setName("Dexter");
	 
	 
	 d4.setType("Cats");
	 d4.setAge(1);
	 d4.setBreed("Purssian");
	 d4.setColor("White");
	 d4.setName("Leo");
	
	 
	 d5.setType("Cats");
	 d5.setAge(2);
	 d5.setBreed(" himalayn Purssian");
	 d5.setColor("White-black");
	 d5.setName("Billi");
	
	 
	 
	 d6.setType("Cats");
	 d6.setAge(3);
	 d6.setBreed("Junglee");
	 d6.setColor("silver");
	 d6.setName("jiilii");
	
	 

	 
	 d7.setType("Birds");
	 d7.setAge(1);
	 d7.setBreed("Love");
	 d7.setColor("pink");
	 d7.setName("lili");
	
	 
	 
	 d8.setType("Birds");
	 d8.setAge(2);
	 d8.setBreed("Parrot");
	 d8.setColor("Green");
	 d8.setName("killii");
	
	 
	 
	 d9.setType("Birds");
	 d9.setAge(3);
	 d9.setBreed("cute");
	 d9.setColor("red");
	 d9.setName("rose");
	
	 
	 Pets[] pet = {d1,d2, d3,d4,d5,d6,d7,d8,d9};
	 
	 for(int i=0;i<pet.length;i++) {
			/*
			 * System.out.println("Type :   "+pet[i].getType());
			 * System.out.println("Age  :    "+pet[i].getAge());
			 * System.out.println("Breed:  "+pet[i].getBreed());
			 * System.out.println("Color:   "+pet[i].getColor());
			 * System.out.println("Name :    "+pet[i].getName());
			 */
         System.out.println(pet[i]);            //toString  gives all the answers
		 System.out.println("**************************************");
	
	 }
	 
	 System.out.println(d3.equals(d4));  // override hashcode and equals
	 System.out.println(d3 .hashCode());   //hashCode method
	 System.out.println(d4.hashCode());
	 
	}

}

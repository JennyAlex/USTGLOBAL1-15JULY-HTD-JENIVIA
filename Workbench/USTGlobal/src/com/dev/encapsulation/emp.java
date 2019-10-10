package com.dev.encapsulation;

public class emp  {

	public static void main(String[] args) {
		 EmpIntImpl f = new  EmpIntImpl();
		Employee  e1= new Employee();
		e1.setAge(23);
		e1.setEmail("str12@fgmail.com");
		e1.setName("hinnn");
		
		Employee  e2= new Employee();
		e2.setAge(22);
		e2.setEmail("str12@fgmail.com");
		e2.setName("hinnnggh");
	    
	boolean b = 	f.putEmployee(e1);


    
	System.out.println(b);

	boolean b1 = f.removeEmployee(e2);
	System.out.println(b1);

	}

}

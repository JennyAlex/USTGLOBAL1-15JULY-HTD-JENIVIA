package com.dev.practise;

import java.util.HashMap;

public class EmpImplement  implements EmpInt{
 HashMap<String , Employee> hs = new HashMap<String ,Employee>();
	public static void main(String[] args) {
	

	}

	@Override
	public boolean put(String i, Employee e) {
   if(e!=null) {
	   hs.put(i,e);
	   return true;
   }
   {
		return false;
   }
	}

	@Override
	public boolean remove(String i, Employee e) {
	if(e!=null) {
		hs.remove(i,e);
		return true;
	}
	{
		return false;
	}
	}
	
	

	@Override
	public void get() {
	System.out.println(hs);
		
	}

}

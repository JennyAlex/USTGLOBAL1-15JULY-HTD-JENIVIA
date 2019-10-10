package com.dev.encapsulation;

import java.util.HashMap;

public class EmpIntImpl implements EmployeeInterface {
	HashMap<String, Employee> h = new HashMap<String, Employee>();
	public static void main(String[] args) {
	
	
		

	}

	@Override
	public boolean putEmployee(Employee e) {
		if(e!= null) {
			h.put("1",e);
			return true;
		}
		{
	
		return false;
		}
	}

	@Override
	public boolean removeEmployee(Employee e) {
		if(e !=null) {
			h.remove(e);
			return true;
		}
	
		return false;
	}

	@Override
	public void getEmployee(Employee e) {
		h.get(e);
	
		
	}

}

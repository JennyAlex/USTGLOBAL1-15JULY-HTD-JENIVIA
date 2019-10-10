package com.dev.operations1;

import java.util.Scanner;

import com.dev.beans.Users;
import com.dev.services.UserServiceImpl;
import com.dev.services.UserServices;

public class GetAllInfo {

	public static void main(String[] args) {
		UserServices us = new UserServiceImpl();
	
		us.getAllInfo();
	
		

	}

}

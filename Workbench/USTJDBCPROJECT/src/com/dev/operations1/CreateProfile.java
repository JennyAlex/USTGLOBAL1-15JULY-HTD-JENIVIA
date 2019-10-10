package com.dev.operations1;

import java.util.Scanner;

import com.dev.beans.Users;
import com.dev.services.UserServiceImpl;
import com.dev.services.UserServices;


public class CreateProfile {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				UserServices us = new UserServiceImpl();
				
				Users user = new Users();
				
				System.out.println("Enter the UserId");
				user.setUserId(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter the User Name");
				user.setUserName(sc.nextLine());
				System.out.println("Enter the Email");
				user.setEmailId(sc.nextLine());
				System.out.println("Enter the Password");
				user.setPassword(sc.nextLine());
				
				us.createProfile(user);
			}
		

	}



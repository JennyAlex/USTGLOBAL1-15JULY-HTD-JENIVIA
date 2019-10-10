package com.dev.services;

import com.dev.beans.Users;
import com.dev.dao.UserDAOJDBC;
import com.dev.dao.UserDaoInterface;

public class UserServiceImpl implements UserServices {

	public static void main(String[] args) {
	
	UserDaoInterface dao = new UserDAOJDBC ();
	

	}

	@Override
	public Users getAllInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProfile(Users user) {
		// TODO Auto-generated method stub
		
	}

}

package com.dev.dao;

import com.dev.beans.Users;

public interface UserDaoInterface {
	public Users getAllInfo();
	public void createProfile(Users user);
}

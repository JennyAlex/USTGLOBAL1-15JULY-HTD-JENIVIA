package com.dev.services;

import com.dev.beans.Users;

public interface UserServices {
	public Users getAllInfo();
	public void createProfile(Users user);
}

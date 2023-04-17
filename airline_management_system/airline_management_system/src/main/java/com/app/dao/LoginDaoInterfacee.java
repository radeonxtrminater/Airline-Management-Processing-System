package com.app.dao;

import java.util.List;

import com.app.pojos.Admin;
import com.app.pojos.Packages;
import com.app.pojos.Users;

public interface LoginDaoInterfacee {

	Admin checkAdminAvailablity();

	void registerAdmin(Admin admin1);

	Users verifyUser(String email, String password);

	Admin verifyAdmin(String email, String password);

	boolean checkEmailAvailable(String email);

	String registerUser(Users user);

	String changePassword(String email, String password);

	List<Packages> flightSearch(String to);

}


package com.hm.datab.dao;

import java.util.List;

import com.hm.datab.beans.Login;

public interface LoginDAO {

	public Login loadUserLogin(Login user);
	public List<Login> loadLoginDetails(String email);
}

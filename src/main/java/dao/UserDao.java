package dao;

import model.UserParam;

public interface UserDao {

	UserParam queryUserDao(Integer Id);
	
	void addUser(UserParam user);
}

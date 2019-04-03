package service;

import model.UserParam;

public interface UserService {
	UserParam queryUser(Integer Id);
	
	void addUser(UserParam userparam);
}

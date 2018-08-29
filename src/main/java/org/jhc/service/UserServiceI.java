package org.jhc.service;

import org.jhc.entity.User;

public interface UserServiceI {
	void addUser(User user);
	User getUserById(int id);
}

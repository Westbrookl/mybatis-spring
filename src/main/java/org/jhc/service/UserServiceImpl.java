package org.jhc.service;

import org.jhc.Dao.UserMapper;
import org.jhc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserMapper userMapper;
	
	public void addUser(User user){
		userMapper.insert(user);
	}
	
	public User getUserById(int id){
		return userMapper.selectByPrimaryKey(id);
	}
}

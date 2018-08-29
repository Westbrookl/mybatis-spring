package org.jhc.test;

import org.jhc.entity.User;
import org.jhc.service.UserServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml", "classpath*:spring-mybatis.xml" })
public class MybatisTest {
	@Autowired
	private UserServiceI userService;//这里会自动封装一个实现了UserServiceI的接口的类。
	@Test
	public void testAddUser(){
		User user = new User();
		user.setUserId(1);
		user.setUserAge(17);
		user.setUserName("jihaichuan");
		userService.addUser(user);
	}
	
	@Test
	public void testGetUserById(){
		int userId = 1;
		User user = userService.getUserById(userId);
		System.out.println(user.getUserName());
	}
}

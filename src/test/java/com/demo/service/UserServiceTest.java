package com.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/spring-servlet.xml,classpath*:spring/applicationcontext-service.xml,classpath*:mongodb/mongodb-config.xml"})
public class UserServiceTest {
	@Autowired	
	private UserService userService;
	@Test
	public void test_mongo () {
		User user = userService.findUser("wudq");
		System.out.println(user.getAge());
	}
}

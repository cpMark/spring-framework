package com.example.test.ch7;

import com.example.test.ch2.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-string.xml");
		User user = (User) applicationContext.getBean("user1");
		System.out.println(user);
	}

}

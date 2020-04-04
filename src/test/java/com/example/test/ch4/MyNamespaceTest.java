package com.example.test.ch4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyNamespaceTest {

	@Test
	public void testMyNamespace() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("myNamespaceTest.xml");
		User user = (User) bf.getBean("testBean");
		System.out.println(user.getUserName() + " : " + user.getEmail());
	}

}

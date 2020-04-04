package com.example.test.ch3.dir2;

import com.example.test.ch3.GetBeanTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChangeMethodTest {

	@Test
	public void testChangeMethod(){
		ApplicationContext bf = new ClassPathXmlApplicationContext("replacedMethodTest.xml");
		TestChangeMethod test = (TestChangeMethod) bf.getBean("testChangeMethod");
		test.changeMe();
	}
}

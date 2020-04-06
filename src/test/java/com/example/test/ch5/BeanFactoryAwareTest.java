package com.example.test.ch5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryAwareTest {

	@Test
	public void testBeanFactoryAware(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanFactoryAwareTest.xml");
		Hello test = (Hello) ctx.getBean("test");
//		test.testBeanFactoryAware();
	}

}

package com.example.test.ch3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLookupMethod {


	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("lookupTest.xml");
		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
		test.showMe();
	}

}

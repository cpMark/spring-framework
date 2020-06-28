package com.example.test.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");

		Dao dao = (Dao) ac.getBean("daoImpl");
		dao.select();
	}

}

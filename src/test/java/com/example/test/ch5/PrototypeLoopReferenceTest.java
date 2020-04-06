package com.example.test.ch5;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeLoopReferenceTest {

	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testLoopReference() throws Throwable {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("loopReferenceTest2.xml");
			System.out.println(ctx.getBean("testA"));
		} catch (Exception e) {
			Throwable cause = e.getCause().getCause().getCause();
			throw cause;
		}
	}
}

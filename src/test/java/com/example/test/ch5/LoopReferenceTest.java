package com.example.test.ch5;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoopReferenceTest {

	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testLoopReference() throws Throwable {
		try {
			new ClassPathXmlApplicationContext("loopReferenceTest.xml");
		} catch (Exception e) {
			Throwable cause = e.getCause().getCause().getCause();
			throw cause;
		}
	}
}

package com.example.test.ch2;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test-string.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assert bean.getTestStr().equals("testStr");
	}
}

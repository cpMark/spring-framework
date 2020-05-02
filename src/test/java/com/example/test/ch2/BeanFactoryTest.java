package com.example.test.ch2;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("test-string.xml"));
		Student bean = (Student) bf.getBean("student");
		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		User user = (User) bf.getBean(User.class);
		bf.destroySingletons();
	}
}

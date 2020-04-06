package com.example.test.ch5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class TestBeanFactoryAware implements BeanFactoryAware {

	private BeanFactory bf;

	/**
	 * 声明bean的时候Spring会自动注入BeanFactory
	 * @param beanFactory owning BeanFactory (never {@code null}).
	 * The bean can immediately call methods on the factory.
	 * @throws BeansException
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		bf = beanFactory;
	}

	public void testAware(){
		//通过hello这个bean id从beanFactory获取实例
		Hello hello = (Hello) bf.getBean("hello");
		hello.say();
	}
}

package com.example.test.ch2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class UserBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("回调了BeanPostProcessor#postProcessBeforeInitialization");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("回调了BeanPostProcessor#postProcessAfterInitialization");
		return null;
	}
}

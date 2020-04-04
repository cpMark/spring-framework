package com.example.test.ch4;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	/**
	 * Element对应的类
	 * @param element
	 * @return
	 */
	protected Class getBeanClass(Element element){
		return User.class;
	}

	/**
	 * 从element中农解析并提前对应的元素
	 * @param element
	 * @param bean
	 */
	protected void doParse(Element element, BeanDefinitionBuilder bean){
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");

		//将提取的数据放入BeanDefinitionBuilder中，待到完成所有bean的解析后统一注册到beanFactory中
		if (StringUtils.hasText(userName)){
			bean.addPropertyValue("userName",userName);
		}
		if(StringUtils.hasText(email)){
			bean.addPropertyValue("email",email);
		}

	}

}

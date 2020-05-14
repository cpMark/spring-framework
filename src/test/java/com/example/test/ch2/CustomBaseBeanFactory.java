package com.example.test.ch2;

public class CustomBaseBeanFactory {

	public BaseBean generateBaseBean(){
		BaseBean baseBean = new BaseBean();
		baseBean.setBaseId("007");
		baseBean.setBaseName("动摇动摇我是东拐");
		return baseBean;
	}

}

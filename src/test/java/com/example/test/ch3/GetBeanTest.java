package com.example.test.ch3;

public abstract class GetBeanTest {
	public void showMe(){
		this.getBean().showMe();
	}

	public abstract User getBean();
}

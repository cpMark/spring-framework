package com.example.test.ch2;

import org.springframework.beans.factory.InitializingBean;

public class People implements InitializingBean {

	private Boolean isMan;

	private BaseBean baseBean;

	@Override
	public String toString() {
		return "People{" +
				"isMan=" + isMan +
				'}';
	}

	public static People generatePeopleObj(){
		People p = new People();
		return p;
	}

	public void destroy(){
		System.out.println("回收People对象-----------");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.isMan = true;
	}
}

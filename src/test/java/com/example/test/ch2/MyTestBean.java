package com.example.test.ch2;

public class MyTestBean {
	private String testStr;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public MyTestBean(String name, User user) {
		this.testStr = name;
		this.user = user;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"testStr='" + testStr + '\'' +
				", user=" + user +
				'}';
	}
}

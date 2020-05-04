package com.example.test.ch2;

public class User {

	private String id;

	private String name;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User() {
	}

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public void changeInitParam() {
		this.name = "ccc";
	}

	/**
	 * 被lookup-method标签替换前的原始方法
	 */
	public void lookupMethod(){
		System.out.println("I am original lookup method!!!!");
	}
	
	/**
	 * 被replaced-method标签替换前的原始方法
	 */
	public void replacedMethod(){
		System.out.println("i am original replaced method!!!");
	}

}

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

}

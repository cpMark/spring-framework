package com.example.test.ch2;

import org.springframework.beans.factory.DisposableBean;

public class Student implements DisposableBean {

	private User user;

	private Integer score;

	private People people;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Student() {
	}

	public Student(User user, Integer score,People people) {
		this.user = user;
		this.score = score;
		this.people = people;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("student销毁了----------------");
	}
}

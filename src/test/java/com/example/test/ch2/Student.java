package com.example.test.ch2;

import org.springframework.beans.factory.DisposableBean;

public class Student extends User implements DisposableBean {

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

	public Student() {
	}

	public Student(Integer score,People people) {
		this.score = score;
		this.people = people;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("student销毁了----------------");
	}

	@Override
	public String toString() {
		return "Student{" +
				"score=" + score +
				", people=" + people +
				'}';
	}
}

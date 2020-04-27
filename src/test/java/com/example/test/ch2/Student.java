package com.example.test.ch2;

public class Student {

	private User user;

	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
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

	public Student(User user, int score) {
		this.user = user;
		this.score = score;
	}

}

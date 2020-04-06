package com.example.test.ch5;

public class TestB {

	private TestC testC;

	public void b(){
		testC.c();
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

}

package com.example.test.ch2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.support.security.support.DestroyBean;
import org.springframework.context.Lifecycle;


public class CircleReferenceClassB implements Lifecycle {

	private CircleReferenceClassA circleReferenceClassA;

//	public CircleReferenceClassB(CircleReferenceClassA circleReferenceClassA){
//		this.circleReferenceClassA = circleReferenceClassA;
//	}


	public void setCircleReferenceClassA(CircleReferenceClassA circleReferenceClassA) {
		this.circleReferenceClassA = circleReferenceClassA;
	}

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}
}

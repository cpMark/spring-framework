package com.example.test.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {

	/**
	 * SimpleDateFormat是非线程安全的，多线程调用其parse会报异常
	 */
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static class ParseDate implements Runnable {
		int i = 0;

		public ParseDate(int i) {
			this.i = i;
		}

		@Override
		public void run() {
			try {
				//通过加锁来处理parse的非线程安全问题
				Date t = sdf.parse("2020-04-10 07:36:" + i % 60);
				System.out.println(i + " : " + t);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++) {
			es.execute(new ParseDate(i));
		}
	}
}

package com.example.test.other;

public class ShallowCopy {
	public static void main(String[] args) {
		Subject subject = new Subject("english");
		Student studentA = new Student();
		studentA.setSubject(subject);
		studentA.setName("cc");
		studentA.setAge(20);
		Student studentB = (Student) studentA.clone();
		//clone之后进行基础数据类型的修改——原来studentA的值不受影响
		studentB.setName("ccc");
		studentB.setAge(18);
		Subject subjectB = studentB.getSubject();
		//clone之后进行引用数据类型的修改
		subjectB.setName("math");
		System.out.println("studentA:" + studentA.toString());
		System.out.println("studentB:" + studentB.toString());
	}
}

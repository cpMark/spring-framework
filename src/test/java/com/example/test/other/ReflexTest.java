package com.example.test.other;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflexTest {

	@Test
	public void testReflec() throws Exception {
//		System.out.println("===============获取Class===============");
//		test1();
//		System.out.println("===============获取Field===============");
//		test2();
//		System.out.println("===============获取Method===============");
//		test3();
//		System.out.println("===============获取Constructor===============");
//		test4();
//		System.out.println("===============通过反射获取对象实例===============");
//		test5();
//		System.out.println("===============通过反射调用对象方法===============");
//		test6();
		System.out.println("===============通过反射修改对象变量值方法===============");
		test7();

	}


	/**
	 * 通过反射来修改字段值
	 */
	private void test7() throws Exception {
		Class<?> personClass = Class.forName("com.example.test.other.Person");
		Person person = (Person) personClass.newInstance();
		Field declaredField = personClass.getDeclaredField("name");
		declaredField.setAccessible(true);
		declaredField.set(person,new String("name c"));
		System.out.println(person);
	}

	/**
	 * 通过反射来调用实例的方法
	 */
	private void test6() throws Exception {
		Class<?> personClass = Class.forName("com.example.test.other.Person");
		Person person = (Person) personClass.newInstance();
		Method method = personClass.getMethod("setName",String.class);
		method.invoke(person,"abc");
		// 私有方法反射获取
		Method age = personClass.getDeclaredMethod("setAge", Integer.class);
		age.setAccessible(true);
		age.invoke(person,new Integer(123));
		System.out.println(person);
	}

	/**
	 * 通过反射获取实例，并为实例设置对象
	 */
//	private void test5() throws Exception {
//		//通过Class对象构造实例
//		Class<?> personClass = Class.forName("com.example.test.other.Person");
//		Person person = (Person) personClass.newInstance();
//		person.setName("cc");
//		person.setAge(22);
//
//		System.out.println(person);
//
//		// 通过构造函数来构造实例——获取构造数组(数组中的构造函数是严格按照类中的构造函数顺序来的)
//		Constructor<?>[] constructors = personClass.getConstructors();
//		Constructor<?> constructor = constructors[0];
//		Person person1 = (Person) constructor.newInstance();
//		person1.setName("ccc");
//		person1.setAge(28);
//		System.out.println(person1);
//
//		// 通过类型直接获取特定的构造
//		Constructor<?> specialConstructor = personClass.getConstructor(String.class, Integer.class);
//		Person person2 = (Person) specialConstructor.newInstance("cccc",25);
//		System.out.println(person2);
//	}

	/**
	 * 通过反射获取Class对象的所有方法
	 */
	private void test4() throws Exception {
		Class<?> strClass = Class.forName("java.lang.String");
		// 获取public修饰的构造函数
		Constructor<?>[] constructors = strClass.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor.getName());
		}

		System.out.println("---------------------");

		Constructor<?>[] declaredConstructors = strClass.getDeclaredConstructors();
		for (Constructor<?> declaredConstructor : declaredConstructors) {
			System.out.println(declaredConstructor.getName());
		}
	}

	/**
	 * 通过反射获取Class对象的所有方法
	 */
	private void test3() throws Exception {
		Class<?> strClass = Class.forName("java.lang.String");
		// 获取public修饰的方法
		Method[] methods = strClass.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		System.out.println("---------------------");

		// 所有方法
		Method[] declaredMethods = strClass.getDeclaredMethods();
		for (Method declaredMethod : declaredMethods) {
			System.out.println(declaredMethod.getName());
		}
	}

	/**
	 * 通过反射获取Class对象的所有字段
	 */
	private static void test2() throws Exception {
		Class<?> strClass = Class.forName("java.lang.String");
		// 获取public修饰的字段
		Field[] fields = strClass.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		System.out.println("---------------------");

		// 所有字段
		Field[] declaredFields = strClass.getDeclaredFields();
		for (Field declaredField : declaredFields) {
			System.out.println(declaredField);
		}

	}

	/**
	 * 通过反射获取Class对象
	 */
	private static void test1() throws Exception {
		// 获取Class有3种方式
		Class<String> strClass = String.class;
		System.out.println(strClass.getName());

		String str = "hello class";
		Class<? extends String> str2Class = str.getClass();
		System.out.println(str2Class.getName());

		// 要使用全类名
		Class<?> str3Class = Class.forName("java.lang.String");
		System.out.println(str3Class.getName());
	}

}

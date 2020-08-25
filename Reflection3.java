package com.df.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflection3 {

	public static void main(String[] args) throws ClassNotFoundException, Exception{
		// TODO 自动生成的方法存根
		// 1)通过反射 创建两个 User对象
		// 2)使用两个不同的构造器
		// 3)通过反射给age和name赋值
		Class<?> userClazz = Class.forName("com.df.reflection.User");
		
		User user1 = (User) userClazz.newInstance();	
//        使用反射给user1的age和name赋值
		Field nameFileld = userClazz.getDeclaredField("name");
		nameFileld.setAccessible(true);
         //		无参构造
		//将私有属性公开
		 Field ageFileld =userClazz.getDeclaredField("age");
		 ageFileld.setAccessible(true);
		ageFileld.set(user1,10);
		nameFileld.set(user1,"java");
		System.out.println(user1);
//              有参构造
		Constructor<?> userConstructor= userClazz.getDeclaredConstructor(int.class,String.class);
		userConstructor.setAccessible(true);
		Object user2=  userConstructor.newInstance(100,"dfdf");
		System.out.println(user2);
		nameFileld.set(user2, "fdfd");
		ageFileld.set(user2, 20);
		System.out.println(user2);
	}

}

class User {
	private int age;
	private String name;

	public User() {

	}

	private User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

}
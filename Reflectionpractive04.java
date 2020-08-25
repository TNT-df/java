//package com.df.reflection;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//
//public class Reflectionpractive04 {
//
//	public static void main(String[] args) throws  Exception,ClassNotFoundException {
//		// TODO 自动生成的方法存根
//  Class<?> soliderClass = Class.forName("com.df.reflection.solider");
//  
//  solider solider1= (solider) soliderClass.newInstance();
//   Field rankField = soliderClass.getDeclaredField("rank");
//   rankField.setAccessible(true);
//   rankField.set(solider1, "特战部队");
//   
//   Field nameField = soliderClass.getDeclaredField("name");
//   Field ageField = soliderClass.getDeclaredField("age");
//   nameField.setAccessible(true);ageField.setAccessible(true);
//   nameField.set(solider1, "dfdf");
//   ageField.set(solider1, 20);
//   
//  System.out.println(solider1);
//  
//  Constructor<?> soliderConstructor=soliderClass.getDeclaredConstructor(String.class,String.class,int.class);
//  soliderConstructor.setAccessible(true);
//  Object solider2= soliderConstructor.newInstance("西工大","上岸",2022);
//  System.out.println(solider2);
// 
//	}
//
//}
//class solider{
//	private String name;
//	private String rank;
//	private int age;
//	
//	public solider() {
//	}
//
//	private solider(String name, String rank, int age) {
//		super();
//		this.name = name;
//		this.rank = rank;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "solider [name=" + name + ", rank=" + rank + ", age=" + age + "]";
//	}
//	
//}
package com.df.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflectionpractive04 {
	public static void main(String[] args) throws Exception {
    Class<?>  somethingClazz =  something.class;
    something   sm1 = (something) somethingClazz.newInstance();
    Field nameField = somethingClazz.getDeclaredField("name");
     nameField.setAccessible(true);
     nameField.set(sm1, "西工大");
     Field sizeField= somethingClazz.getDeclaredField("size");
     sizeField.setAccessible(true);
     sizeField.set(sm1,"上岸");
     System.out.println(sm1);
    Constructor<?> constructor1=somethingClazz.getDeclaredConstructor(String.class,String.class);
     constructor1.setAccessible(true);
     Object obj1=constructor1.newInstance("df","加油");
     System.out.print(obj1);
     Method  method1=somethingClazz.getDeclaredMethod("f1");
     method1.invoke(null);
	}
}

class something {
	private String name;
	private String size;

	public something() {
		super();
	}

	private something(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}
	public static void f1() {
		System.out.println("我太难了");
	}

	@Override
	public String toString() {
		return "something [name=" + name + ", size=" + size + "]";
	}
	

}
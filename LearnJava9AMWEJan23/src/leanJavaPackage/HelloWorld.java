package leanJavaPackage;

import classesandObjects.AccessModifiers;

public class HelloWorld extends AccessModifiers {

	String name2;
	static String name3;

	public static void main(String[] args) {
		System.out.println("Hello World");

		AccessModifiers am = new AccessModifiers();

		HelloWorld hw = new HelloWorld();
		hw.test1();
		hw.test2();
		
	}

}

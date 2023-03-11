package polymorphismdemo;

import java.util.Scanner;

public class MethodOverlaodingDemo {
	String user="Arun";
	
	 void greet() {
		System.out.println("Hello!!!!");
	}
	
	private static void greet(String name) {
		System.out.println("Hello "+name);
	}
	
	 void greet(String name, int age) {
		System.out.println("Hello "+name+" and I am "+age+" years old");
	}
	
	public void greet(int age, String name ) {
		System.out.println("Hello "+name+" and I am "+age+" years old");
	}
	
	public static void test() {
		System.out.println("Inside overloading class");
	}
	
	public static void main(String[] args) {
		MethodOverlaodingDemo md = new MethodOverlaodingDemo();
		md.greet("Arun", 32);
		md.greet(32,"Arun");
		
		Scanner sc = new Scanner("");
	}

	public static void main(int[] args) {
		
	}
}

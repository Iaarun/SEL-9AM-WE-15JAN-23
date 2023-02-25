package leanJavaPackage;

import java.util.Scanner;

public class _004UserInput {

 static	 Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		findMax();

	}

	public static void userInput() {
		// String input
	//	Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.next();
		System.out.println("Enter any decimal number");
		double dvar = in.nextDouble();
		System.out.println("Enter any boolean data");
		boolean flag = in.nextBoolean();
		System.out.println("Enter any Character data");
		char ch = in.next().charAt(0);

		System.out.println(name);
		System.out.println(dvar);
		System.out.println(flag);
		System.out.println(ch);

	}

	public static void add() {
		// user input
		System.out.println("Enter first number");
		// integer input
		int a = in.nextInt();
		System.out.println("Enter second number");
		int b = in.nextInt();

		System.out.println(a + b);
	}

	public static void findMax() {
		System.out.println("Enter first number");
		int a = in.nextInt();
		System.out.println("Enter second number");
		int b = in.nextInt();
		int max = (a > b) ? a : b;
		System.out.println(max);
	}

}

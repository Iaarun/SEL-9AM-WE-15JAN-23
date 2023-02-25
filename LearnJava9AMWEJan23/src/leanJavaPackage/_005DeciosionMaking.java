package leanJavaPackage;

import java.util.Scanner;

/*
  if-else
  switchcase
  
  if(condition){
    code
  }
  
  switch(expression){
     case1:
        code
        break;
    default:
      code
      break:     
 */
public class _005DeciosionMaking {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		switchcasedemo();
	}

	public static void ifDemo() {
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Apply for driving license");
		} else {
			System.out.println("Minors cannot apply for DL");
		}
	}

	public static void nestedIf() {
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Have you clear the test, enter yes or no");
			String flag = sc.next();
			if (flag.equalsIgnoreCase("yes")) {
				System.out.println("Congratulations get the DL");
			} else {
				System.out.println("Clear the test first");
			}

		} else {
			System.out.println("Minors cannot apply for DL");
		}
	}

	public static void ladderif() {
		System.out.println("Enter traffic signal");
		String signal = sc.next();

		if (signal.equalsIgnoreCase("green")) {
			System.out.println("GO");
		} else if (signal.equalsIgnoreCase("red")) {
			System.out.println("STOP");
		} else if (signal.equalsIgnoreCase("orange")) {
			System.out.println("WAIT");
		} else {
			System.out.println("Signal is not working ");
		}
	}

	public static void testGrade() {
		System.out.println("Enter Three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// double percent= ((a+b+c)*100)/300;
		double percent = ((a + b + c) * 100) / 300;
		System.out.println(percent);
	}
	
	public static void switchcasedemo() {
		System.out.println("Enter month name");
		String monthname = sc.next();
		
		switch(monthname.toLowerCase()) {
		default:
			System.out.println("Invalid input");
			break;
			
		case "jan":
			System.out.println("31 Days");
			break;
			
		case "feb":
			System.out.println("28 Days");
			break;
		case "mar":
			System.out.println("31 Days");
			break;
		case "apr":
			System.out.println("30 Days");
			break;
		case "may":
			System.out.println("31 Days");
			break;
		case "jun":
			System.out.println("30 Days");
			break;
		case "jul":
			System.out.println("31 Days");
			break;
		case "aug":
			System.out.println("31 Days");
			break;
		case "sep":
			System.out.println("30 Days");
			break;
		case "oct":
			System.out.println("31 Days");
			break;
		case "nov":
			System.out.println("30 Days");
			break;
		case "dec":
			System.out.println("31 Days");
			break;
			
		 
		}
	}
	
	

}

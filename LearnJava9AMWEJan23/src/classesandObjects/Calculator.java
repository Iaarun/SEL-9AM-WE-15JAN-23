package classesandObjects;

import java.util.Scanner;

/*
  a, b, c
  
  result= a+b
  
  result -c
 */
public class Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a=20, b=30, c=10;
	double result=	cal.add(a,b);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(result-c);
	}
	
	
	public  double add(int a, int b) {
		return (a+b);
	}
	
	public String sayUser(String name) {
		return "Hello "+name;
	}
	
	public Vehical test() {
		Vehical obj = new Vehical();
		return obj;
	}
}

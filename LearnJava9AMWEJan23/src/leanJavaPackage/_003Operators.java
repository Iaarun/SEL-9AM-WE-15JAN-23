package leanJavaPackage;
/*
  Assignment
  comparison 
  Arithmetic
  bitwise
  ternary
  logicaloperators
 */
public class _003Operators {
	public static void main(String[] args) {
		logicaloperators();
	}
	
	public static void assignmentoperator() {
		// =
		int age = 10;
		int i1 = age;
		System.out.println(i1);
	}

	
	public static void arithmeticoperator() {
		//  + - * /  %(modulo)
		
		int a =10;
		int b = 3;
		
		System.out.println(a+b);//13
		System.out.println(a-b);//7
		System.out.println(a*b);//30
		System.out.println(a/b);//3
		System.out.println(a%b);//1
	}
	
	public static void comparisonOperator() {
		// ==  !=  >  <  >=   <=
		
		int a = 10;
		int b = 3;
		
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		
	}
  
	public static void ternaryOperators() {
		// (condition)? expression1:expression2
		int a=10;
		int b=13;
		
	int res=(a>b)?(a+b):(a-b);
	System.out.println(res);
	}
	
	public static void logicaloperators() {
		int a=10;
		int b =35;
		int c = 20;
		
		System.out.println((a>b)||(c>b));//true
		System.out.println((a>b)&&(c>b));//false
		
	}
}

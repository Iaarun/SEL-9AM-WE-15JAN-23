package leanJavaPackage;

import java.util.Scanner;

/*
  for
  while
  do-while
 */
public class _006LoopStatement {
	public static void main(String[] args) {
		_006LoopStatement ls = new _006LoopStatement();
		ls.continuestatement();
	}

	public void forloopDemo() {
         /*
           for(initialization; condition; increment/decrement){
                   code block
           }
          */
		
		for(int i=1; i<=3;i++) {
			System.out.println("Hello World!!");
		}
	}
	
	public void tableofAnumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num*i+" ");
		}
	}
	
	public void factorialofanumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}
	
	public void nestedforLoopDemo() {
		/*
		 for(initialization; condition; increment/decrement){
		      for(initialization; condition; increment/decrement){
                   code block
              }
           }
		 */
		int count=1;
		for(int i =1; i<=4; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(count+" ");
			}
			count++;
			System.out.println();
		}
		
	}
	
	public void pattern1() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern2() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern3() {
		for(int i=1; i<=4; i++) {
			for(int j=i; j<=4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void patter4() {
		for(int i=1; i<=4; i++) {
			for(int j=i; j<=4; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

   public void whileloopdemo() {
	   /*
	    initialization;
	    while(condition){
	        code
	        increment/decrement;
	    }
	    */
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int fact =1;
		int i=1;
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		System.out.println(fact);
   }
   
   public void breakstatement() {
	   
	   for(int i=1; i<=10; i++) {
		  
		   if(i==8) {
			   break;
		   }
		   System.out.println(i);
	   }
   }
   
public void continuestatement() {
	   
	   for(int i=1; i<=10; i++) {
		   System.out.println(i);
		   if(i==8) {
			   continue;
		   }
		   
	   }
   }
}

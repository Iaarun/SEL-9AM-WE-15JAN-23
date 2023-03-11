package polymorphismdemo;


public class MethodOverriding extends MethodOverlaodingDemo {
	String user = "Amit";
    
	
	public void greet(String name, int age) {
		System.out.println("Hi I am "+ name+  " and I am "+age+" years old");
	}
	
	
	public static void test() {
		System.out.println("Inside overriding class");
	}
	
	
	public static void main(String[] args) {
		MethodOverriding mov = new MethodOverriding();
		mov.greet("Arun", 32);
		
		MethodOverlaodingDemo md = new MethodOverlaodingDemo();
		md.greet("Amit",30);
		System.out.println(md.user);
		
		MethodOverlaodingDemo md1 =  new MethodOverriding();
		md1.greet("Sumit",25);
		System.out.println(md1.user);
	}
} 

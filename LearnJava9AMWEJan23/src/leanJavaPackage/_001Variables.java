package leanJavaPackage;

/*
  local
  instance 
  class
 */
public class _001Variables {
	//instance variable
	String name;

	//class variable
	static String courseName;

	public static void main(String[] args) {
		//testmethod1();
		// System.out.println(age);
		
		//object of the class
		_001Variables obj1 = new _001Variables();
		_001Variables obj2 = new _001Variables();
		
		obj1.name="Arun";
		obj2.name = "Amit12";
		
		courseName ="Selenium";
		courseName="Java1";
		
		System.out.println(obj1.name);
		System.out.println(courseName);
		System.out.println(obj2.name);
		System.out.println(courseName);
	}

	public static void testmethod1() {
		// datatype identifier = value;

		// declaration of variable
		int age;
		// initialization
		age = 30; // literal
		
		age = 12;
		System.out.println(age);
		
		double marks;
	}

	public static void testmethod2() {
		// local variable
		int age = 15;
		int salary = 30000;
	}
}

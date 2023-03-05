package classesandObjects;

public class TestAdd {
	
	public static void main(String[] args) {
		TestAdd ta = new TestAdd();
		ta.add();
		ta.add(15,20);
		
		AccessModifiers am1 = new AccessModifiers();
		am1.test1();
		am1.test2();
		am1.test3();
		
		
		AccessModifiers.test5();
		
		
	}
	
	//Parameterized function
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	//non parameterized
	public void add() {
		int a=30, b = 20;
		System.out.println(a+b);
	}

}

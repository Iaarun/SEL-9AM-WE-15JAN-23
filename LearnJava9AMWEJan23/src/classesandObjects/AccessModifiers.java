package classesandObjects;
/*
  public
  protected
  default
  private
  
 */
public class AccessModifiers {
	
	public String str1;
	protected String str2;
	String str3;
	private String str4;
	
	
	public void test1() {
		System.out.println("Test 1 Method");
	}
	
	protected void test2() {
		System.out.println("Test 2 Method");
	}

	 void test3() {
		System.out.println("Test 3 Method");
	}
	
	private static void test4() {
		System.out.println("Test 4 Method");
	}
	
	
	public static void test5() {
		System.out.println("Test 4 Method");
	}
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		am.test1();
		am.test2();
		am.test3();
		am.test4();
		
		test5();
	}
}

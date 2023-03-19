package exceptiondemo;
//finally block
public class ExceptionHandling {
	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling();
		eh.testException();
	}
	
	public void testException() {
		System.out.println("Program Starts");
		int [] arr = {12,15,51,34};
		try {
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]/0);
		}
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Inside finallyblock");
			
		}
		
		System.out.println("Programm ends");
	}

}

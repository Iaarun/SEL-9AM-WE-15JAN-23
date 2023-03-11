package abstractionDemo;

public class Circle extends Shape implements Interface1{
	double radius;
	
	public static void main(String[] args) {
		
		
		
	}

	@Override
	double area() {
	
		return  (Math.PI* Math.pow(radius, 2));
	}
	
	@Override
	public void test() {


	}

}

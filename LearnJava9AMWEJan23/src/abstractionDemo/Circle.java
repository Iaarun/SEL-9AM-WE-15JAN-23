package abstractionDemo;

public class Circle extends Shape implements Interface1{
	double radius;
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		//variable defined in interface are default final and static
	//	c.age=100;
		
	}

	@Override
	double area() {
	
		return  (Math.PI* Math.pow(radius, 2));
	}
	
	@Override
	public void test() {


	}
	
	
}

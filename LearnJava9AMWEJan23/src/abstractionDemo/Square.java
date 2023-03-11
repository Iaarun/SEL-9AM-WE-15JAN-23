package abstractionDemo;

public class Square  extends Shape{
	
	int side;

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.pow(side,2);
	}
	
	

}

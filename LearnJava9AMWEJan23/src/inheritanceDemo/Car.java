package inheritanceDemo;

public class Car extends Vehicle {
//	String vehicalType;
//	String engineType;
//	String engineCapacity;
//	
//	public void engineStarts() {
//		System.out.println("Engine Starts");
//	}
//	
//	public void engineStops() {
//		System.out.println("Engine Stops");
//	}
	
	String airbag;
	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.vehicalType="Sedan";
		car.engineType="V10 Petrol";
		car.engineCapacity="2000CC";
		car.airbag="6 airbags";
		car.engineStarts();
		car.engineStops();
	}

}

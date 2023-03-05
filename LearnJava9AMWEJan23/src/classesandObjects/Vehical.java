package classesandObjects;
 class Test{
	
}
public class Vehical {
	
	String vehicalType;
	String engineType;
	String engineCapacity;
	String seatingCapacity;
	String objectName;
	
	public void setName(String name) {
		objectName=name;
	}
	
	public String getName() {
		return (objectName);
	}
	
	
	/*  accessmodifier  static/nonstatic returntype identifier(){
	  
	  }
	 */
	
	public void engineStarts() {
		System.out.println("Engine Starts");
	}
	
	public void engineStops() {
		System.out.println("Engine Stops");
	}
	
	public void engineStarts(String obj) {
		System.out.println(obj+ " Engine Stops");
	}
	
	
	
	public static void main(String[] args) {
		Vehical car = new Vehical();
		Vehical bus = new Vehical();
		car.engineCapacity="1000CC";
		car.seatingCapacity ="5";
		car.setName("BMW");
		car.engineType="TurboCharge Petrol";
		System.out.println(car.engineCapacity);
		System.out.println(car.engineType);
		System.out.println(car.seatingCapacity);
		car.engineStarts(car.getName());
		//car.engineStops();
		System.out.println("\n==========\n");
		bus.engineCapacity="5000CC";
		bus.seatingCapacity ="20";
		bus.engineType="Diesel";
		System.out.println(bus.engineCapacity);
		System.out.println(bus.engineType);
		System.out.println(bus.seatingCapacity);
		bus.setName("volvo");
		bus.engineStarts(bus.getName());
	//	bus.engineStops();
	}

}

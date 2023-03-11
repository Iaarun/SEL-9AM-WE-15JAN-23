package inheritanceDemo;

public class PickUpTruck  extends Vehicle{
	
	public static void main(String[] args) {
		PickUpTruck pt = new PickUpTruck();
		pt.vehicalType="pickuptruck";
		pt.engineCapacity= "3000CC";
		pt.engineStarts();
		pt.engineStops();
		
	}

}

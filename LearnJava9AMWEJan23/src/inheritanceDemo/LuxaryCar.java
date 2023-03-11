package inheritanceDemo;

public class LuxaryCar extends Car {
	
	@Override
	public void engineStarts() {

             System.out.println("Luxary car engine starts");
	}

	public static void main(String[] args) {
		LuxaryCar lcar = new LuxaryCar();
		lcar.airbag="8 airbag";
		lcar.vehicalType="luxary car";
		lcar.engineStarts();
		
	}
}

package OOpsInheritance;

public class Audi extends Car {
	
	int minspeed=200;
	
	@Override
	public void start() {
		System.out.println("Audi -----start");

	}

	public void autoParking() {
		
		System.out.println("Audi -----Autoparking");

	}
}

package OOpsInheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW -----start");
		
	}
	
	public void autoParking() {
		System.out.println("BMW -----Autoparking");
		
	}

//	public void enginee() {
//		// TODO Auto-generated method stub
//		System.out.println("BMW -----enginee");
//		
//	}
	
	@Override
	public void gear() {

		System.out.println("Automatic Gear----");

	}
	
	
	
	public static void billing() {
		
		System.out.println("BMW biling");
	}


}

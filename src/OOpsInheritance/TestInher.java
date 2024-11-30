package OOpsInheritance;

public class TestInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW obj=new BMW();
		obj.start();
		obj.autoParking();
		obj.enginee();
		obj.gear();
		BMW.billing();
		System.out.println(obj.minspeed);

		System.out.println("---------------");

		Audi aud=new Audi();
		aud.start();
		aud.enginee();
		aud.fueling();
		aud.gear();
		Audi.billing();
		System.out.println(aud.minspeed);

		System.out.println("---------------");

		Car c1=new Car();
		c1.enginee();
		c1.fueling();
		c1.gear();
		c1.stop();
		System.out.println(c1.minspeed);



		Car c2=new Audi();//Topcasting
		c2.start();
		Car.billing();
		System.out.println(c2.minspeed);
		
		
		//Car c3=(Car)new Vehicle();// Downcasting is not allowed 
		
		
		
	}




}

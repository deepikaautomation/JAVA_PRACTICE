package constructorbasics;

public class Customer {
	
	String name;
	int age;
	String[] devices;
	
	public Customer (String name, int age, String[] devices) {
		this.name=name;
		this.age=age;
		this.devices=devices;
				
		
	}
	
	public String[] devicesInfo() {
		return devices;
	}
	
	public int devicesCount() {
		return devices.length;
	}

}

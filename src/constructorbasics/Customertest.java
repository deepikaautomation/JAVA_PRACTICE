package constructorbasics;

import java.util.Arrays;

public class Customertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d[]= {"MACbook","Iphone","Applewatch"};
		System.out.println(Arrays.toString(d));
		Customer cus=new Customer("Deepika", 37, d);
		
		String customerdevices[]=cus.devicesInfo();
		System.out.println(Arrays.toString(customerdevices));
		
		int Countofdevices=cus.devicesCount();
		System.out.println(Countofdevices);
	}

}

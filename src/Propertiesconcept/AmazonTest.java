package Propertiesconcept;

import java.util.Properties;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropReader reder=new PropReader();
		Properties pr=reder.initProperties();
		String brname=pr.getProperty("browsername");
		
		System.out.println("Browsername is" +brname);
		switch(brname.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome launched");
			break;
			
		case "ie":
			System.out.println("ie launched");
			break;
			
			
		 default:
			System.out.println("Invaid browsername");
			break;
		}
		System.out.println("usernamename is" +pr.getProperty("username"));
		

	}

}

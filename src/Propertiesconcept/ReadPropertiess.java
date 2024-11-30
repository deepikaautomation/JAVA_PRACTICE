package Propertiesconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiess {
	public final static String CONFIG_FILE_PATH="src\\Propertiesconcept\\config.properties";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream ip=new FileInputStream(CONFIG_FILE_PATH);
			
			Properties prop=new Properties();
			prop.load(ip);
			String browsername=prop.getProperty("username");
			System.out.println(browsername);
			
			prop.setProperty("Authorization", "abcde63636bearer");
			
			String auth=prop.getProperty("Authorization");
			System.out.println(auth);
			
			System.out.println(prop.size());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

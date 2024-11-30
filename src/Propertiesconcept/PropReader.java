package Propertiesconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	private final static String CONFIG_FILE_PATH="src\\Propertiesconcept\\config.properties";
	private Properties prop;
	
	
	
	public Properties initProperties() {
		
		 prop=new Properties();
	try {
		FileInputStream ip=new FileInputStream(CONFIG_FILE_PATH);
		
		prop.load(ip);
		} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return prop;
  }
}


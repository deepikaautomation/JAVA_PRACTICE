package HashcodeMechanism;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,String> browserlist=new TreeMap<String,String>();
		browserlist.put("b1", "1Chrome");
		browserlist.put("b2", "Firefox");
		browserlist.put("b3", "IE");
		browserlist.put("b4", "Opera");
		browserlist.put("b5", "Safari");
		browserlist.put("1b6", "Chrome");
		browserlist.put("b1", "Chrome");
		
		System.out.println(browserlist);

		
		
		browserlist.forEach((key,value)->System.out.println(key +  value));
	}
	

}

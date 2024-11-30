package HashcodeMechanism;

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> browserlist=new Hashtable<String, String>();
		browserlist.put("b1", "1Chrome");
		browserlist.put("b3", "IE");
		browserlist.put("b2", "Firefox");
		//browserlist.put("b3", "IE");
		browserlist.put("b4", "Opera");
		browserlist.put("b5", "Safari");
		browserlist.put("1b6", "Chrome");
		//browserlist.put(null, "Chrome");
		browserlist.put("b7", "ee");
		//browserlist.put("b8", null);
		
		
		System.out.println(browserlist);
		
		browserlist.remove("1b6");
		System.out.println(browserlist);

	}

}

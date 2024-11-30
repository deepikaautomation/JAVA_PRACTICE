package HashcodeMechanism;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> browerlist= new LinkedHashMap<String, String>();
		browerlist.put("b1", "Chrome");
		browerlist.put("b2", "Firefox");
		browerlist.put("b3", "IE");
		browerlist.put("b4", "Opera");
		browerlist.put("b5", "Safari");
		browerlist.put("b6", "Chrome");
		browerlist.put(null, "Chrome");
		
		System.out.println(browerlist);
		
		for(Map.Entry<String, String> e:browerlist.entrySet()) {
			System.out.println(e);
			
			if (e.getValue().equals("Firefox")) {
				System.out.println("I am caught" + e.getKey());
			}
		}

	}

}

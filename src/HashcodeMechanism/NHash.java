package HashcodeMechanism;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//Map<String,String> empdetail=new HashMap<String,String>();
	

//Map<String,String> empdetail=new LinkedHashMap<String,String>();
		
		Map<String,String> empdetail=new TreeMap<String,String>();
		
		empdetail.put("Niivin", "bb");
		empdetail.put("Deepika", "QA");
		empdetail.put("Tom", "SDET");
		empdetail.put("Divya", "Lead");
		empdetail.put("Niivin", "Trainer");
		//empdetail.put("Niivin", "bb");
		//empdetail.put(null, "Manager");
		//empdetail.put(null, "yyy");
		
		
		System.out.println(empdetail);
		
		System.out.println(empdetail.get("Tom"));
		
		
		for( Map.Entry<String,String> e:  empdetail.entrySet()) {
			System.out.println(e.getKey() + "   , " +e.getValue());
		}
		
	}

}

package HashcodeMechanism;

import java.util.HashMap;
import java.util.Map;

public class Hashcodeone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,String> empdetail=new HashMap<String,String>();
		
		empdetail.put("Deepika", "QA");
		empdetail.put("Tom", "SDET");
		empdetail.put("Divya", "Lead");
		empdetail.put("Niivin", "Trainer");
		empdetail.put("Niivin", "bb");
		empdetail.put(null, "Manager")
		;System.out.println(empdetail);
		empdetail.put(null, "yyy");
		
		
		System.out.println(empdetail);
		
		System.out.println(empdetail.get("Deepika"));
		
		for(Map.Entry<String,String> e:empdetail.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
		empdetail.forEach((key,value)->System.out.println(key  +  value ));
		
		
		



	}

}

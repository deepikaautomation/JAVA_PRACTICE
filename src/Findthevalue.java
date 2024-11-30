import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Findthevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			 int a = 10;
			 System.out.print(a += (a = 5) * (a / 5));
			 
			 
			 System.out.println("---------------------------------------------------------------");
			 
			 getcountofDuplicatevalues("environmentt");
	}
	
	public static void getcountofDuplicatevalues(String stname) {
		
		char[] ch=stname.toCharArray();
		Map<Character,Integer> charmap=new HashMap<Character,Integer>();
		
		for(Character c :ch) {
			
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c,1);
			}
		    
				
		}
		System.out.println(charmap);
		
		
		Set<Map.Entry<Character,Integer>> charset=charmap.entrySet();
		
		for(Map.Entry<Character,Integer> ent:charset) {
			
			if(ent.getValue()>1) {
			System.out.println("Duplicate characters   and its count " + ent.getKey() + "   :  " + ent.getValue());
			}
			
			
		}
		
		
		
		
		
	}

}

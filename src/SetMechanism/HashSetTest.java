package SetMechanism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> st=new HashSet<String>();
		st.add("chrome");
		st.add("firefox");
		st.add("IE");
		st.add(null);
		st.add("opera");
		st.add("safari");
		st.add("chrome");
		st.add("chrome");
		st.add("ZARA");
		
		
		List<String> li=new ArrayList<String>(st);
		System.out.println(li.get(4));
		
		System.out.println(li);
		
		
		
		
		
		
		//System.out.println(st);
		
		for(String e:st) {
			System.out.println(e);
		}
		
		
		Iterator<String> it=st.iterator();
		String val=it.next();
		
		System.out.println(val);
		
		
		while(it.hasNext()) {
			
			String val1=it.next();
			
			System.out.println(val1);
			
		}
		
		
		//converting set to list
		
	List<String> list1=new ArrayList<String>(st);
		
		System.out.println(list1.get(1));
		
		
		
		
		
		

	}

	

}

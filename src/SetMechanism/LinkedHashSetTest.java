package SetMechanism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st=new LinkedHashSet<String>();
		st.add("Chrome");
		st.add("Firefox");
		st.add("IE");
		st.add(null);
		st.add("Opera");
		st.add("Safari");
		st.add("Chrome");
		st.add("Chrome");
		st.add("ZARA");
		
		List<String> li=new ArrayList<String>(st);
		System.out.println(li.get(4));
		
		
		//System.out.println(st);
		
		for(String e:st) {
			System.out.println(e);
		}

	}

}

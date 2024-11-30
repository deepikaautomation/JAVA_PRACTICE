package SetMechanism;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st=new TreeSet<String>();
		st.add("Chrome");
		st.add("Chrome");
		st.add("Firefox");
		st.add("IE");
		//st.add(null);
		st.add("Opera");
		st.add("Safari");
		st.add("Chrome");
		st.add("Chrome");
		st.add("ZARA");
		
		
		List<String> li=new ArrayList<String>(st);
		System.out.println(li.get(4));
		
		
		
		System.out.println(li);
		
		for(String e:st) {
			System.out.println(e);
		}

	}

}

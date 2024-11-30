package Arraylistlearn;

import java.util.ArrayList;
import java.util.Collections;

public class Arraymm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> str=new ArrayList<>();
		str.add("Deepika");
		str.add("Tom");
		str.add("Ann");
		str.add("ELE");
		
		Collections.sort(str);
		System.out.println(str);
		
		Collections.sort(str,Collections.reverseOrder());
		System.out.println(str);
		
		
		Collections.swap(str, 2, 1);
		
		
		ArrayList<Integer> mm=new ArrayList<Integer>();
		mm.add(121);
		mm.add(755);
		mm.add(223);
		mm.add(422);
		
		System.out.println(mm);

		for(Integer e:mm) {
			System.out.println(e);
		}
		
		for(int i=0;i<mm.size();i++) {
			System.out.println(mm.get(i));
		}
		

		ArrayList<Object> oo=new ArrayList<Object>();
		oo.add("Deepika");
		oo.add(30);
		oo.add("34.77");
		
		System.out.println(oo);
		
	}

}

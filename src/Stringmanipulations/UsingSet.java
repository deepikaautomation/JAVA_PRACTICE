package Stringmanipulations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		getCharCount("ddeeepikaa");
		getCharCount("ddeee  pikaa");

	}
	
	public static void getCharCount(String str) {
		char chararry[]=str.toCharArray();
		
		Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
		
		for(Character c:chararry) {
			
			if(!String.valueOf(c).isBlank()) {
			
			if(mp.containsKey(c)){
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c, 1);
			}
			}

		}
		
		System.out.println(mp);
		
	}

}

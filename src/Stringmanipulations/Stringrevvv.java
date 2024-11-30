package Stringmanipulations;

import java.util.Arrays;

public class Stringrevvv {

	public static void main(String[] args) {
		
		
		String s="This Is A Java Program";
		String stt[]=s.split(" ");//[this ][is[]]
		System.out.println(Arrays.asList(stt));
		
		String rev="";
		for(String e : stt) {
			
			
			
			rev= rev+ e.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toLowerCase()) + " " ;
			
		}
		System.out.println(rev.trim());
	

	}

}

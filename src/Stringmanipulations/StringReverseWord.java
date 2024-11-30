package Stringmanipulations;

import java.util.Arrays;

public class StringReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="this is my java code";
		String[] word=s.split(" ");
		//System.out.println(Arrays.toString(word));
		//int len=word.length;
		//System.out.println(len);
		String revword="";
		for(String e:word) {
			String se=StringReverse.reversestr(e);
			revword=revword +" "+se;
			
//			String rev="";
//			for(int i=e.length()-1;i>=0;i--) {
//				rev=rev+ e.charAt(i);
//			}
			}
		System.out.println(revword.trim());
	}

}

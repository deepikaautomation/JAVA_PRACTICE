package Stringmanipulations;

public class StringCapitalletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss="this is my first java code";
		
		String[] word=ss.split(" ");
		String newstr="";
		
		for(String e:word) {
			
			
				
				newstr=newstr+e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase())+" ";
				//String.valueOf(e.charAt(0)).toUpperCase();
				
				
			
			
			
		}
		System.out.println(newstr.trim());
		

	}

}

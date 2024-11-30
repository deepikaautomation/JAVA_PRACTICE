package Stringmanipulations;

public class DataStringRev {
	
	
	public static String strReverse(String s) {
		
	if(s==null) {
		return null;
	}
		
	  if(s.isBlank() || s.isEmpty()) {
		  return "Enter proper string";
	  }
		
		
		
		int len=s.length();
		String rev="";
		
		
		if(len==1) {
			return s;
		}
		
		for(int i=len-1;i>=0;i-- ) {
			
			rev=rev+s.charAt(i);
			
		}
		return rev.trim();
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String revered=strReverse("Computer");
		String revered1=strReverse("a ");
		String revered2=strReverse("Selenium automation");
		String revered3=strReverse(" ");
		System.out.println(revered);
		System.out.println(revered1);
		System.out.println(revered2);
		System.out.println(revered3);
		
		String revered4=strReverse(null);
		

	}

}

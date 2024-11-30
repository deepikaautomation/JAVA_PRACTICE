package Stringmanipulations;

public class StringReverse {

	
	public static String  reversestr(String ss){
		
		
		
		if(ss==null) {
			return null;
		}
		
		int len=ss.length();
		String rev="";
		
		if(ss.isBlank() || ss.isEmpty()) {
			return ss;
		}
		
		if(len==1) {
			return ss;
		}
		
		
		
		for(int i=len-1;i>=0;i--) {
			
		      rev=rev+ss.charAt(i);
			
			}
		return rev;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reversestr(""));
		System.out.println(reversestr(null));
		String reveresd=reversestr("Deepika");
		System.out.println(reveresd);
		System.out.println(reversestr("t"));
		System.out.println(reversestr("testing automation"));
		

	}

}

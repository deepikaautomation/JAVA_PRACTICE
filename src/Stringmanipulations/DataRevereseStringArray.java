package Stringmanipulations;

public class DataRevereseStringArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String ss="This is my java code";
		String ssar[]=ss.split(" ");
		
		String rev=" ";
		for(String e :ssar) {
			
			int len=e.length();
			//rev=rev + " " +DataStringRev.strReverse(e);
			for(int i= len-1;i>=0;i--) {
				
				rev=  rev + e.charAt(i);
				
			}
			 rev=rev + " ";
			 
			
		}
		
		System.out.println(rev.trim());

	}

}

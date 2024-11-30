import java.util.Arrays;

public class Stringlearnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




		String s="This Is A Java Program";
		
		

		String s1=s.replace(" ","")  ;//

		System.out.println(s1);
		String reversedstring="";
		char ar[]=s1.toCharArray();

		for(int i=ar.length-1;i>=0;i--){


			reversedstring=reversedstring+ s1.charAt(i);
		}
		System.out.println(reversedstring);
	
		System.out.println("---------------------");
		
		
		String stt[]=s.split(" ");//[this ][is[]]
		System.out.println(Arrays.asList(stt));
		
		String rev="";
		for(String e : stt) {
			
			
			
			rev= rev+ s.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toLowerCase()) ;
			
		}
		System.out.println(rev.trim());
	
	}





}

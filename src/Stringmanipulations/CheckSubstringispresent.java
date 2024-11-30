package Stringmanipulations;

public class CheckSubstringispresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(substringpresntornot("automationlab","mat"));
		System.out.println(substringpresntornot("automationlab"," "));
		System.out.println(substringpresntornot("automationlab","ab"));

	}
	
	public static boolean substringpresntornot(String mainstr, String substr) {
		return mainstr.matches("(.*)" + substr + "(.*)");
		
		//return mainstr.matches(substr + "(.*)");
		
	}

}

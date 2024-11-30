package Stringmanipulations;

import java.util.Arrays;

public class StringTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello Java This is my first java code in this eclipse";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));
		
		
		System.out.println(str.indexOf('i'));//first occurance
		
	System.out.println(str.indexOf('i',20));//count from 10 th position
	
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		System.out.println(str.indexOf('i', str.indexOf('i')));
		
		System.out.println("----------------------------------------------------------------");
		String mesge="Welcome";
		
		if(mesge.indexOf("admin")==8) {
			System.out.println("user name is present");
		}
		else {
			System.out.println("user name is not present");
		}
		
		System.out.println("----------------------------------------------------------------");
		String str1="  Selenium Automation  ";
		System.out.println(str1.toUpperCase().trim());
		System.out.println(str1.replaceAll("Selenium", "API"));
		
		System.out.println(str1.replace(" ", ""));
	
		System.out.println(str.replace(" ", ""));
		
		System.out.println("automation".replace('a', 'p'));
		
		System.out.println(str.contains("eclipse"));
		
		System.out.println("----------------------------------------------------------------");
		
		
		String lang="JAVA_PYTHON_RUBY_DOTNET";
		String lg[]=lang.split("_");
		System.out.println(Arrays.toString(lg));
		
		System.out.println(lg[2]);
		
		System.out.println("----------------------------------------------------------------");
		
		String data="xXTestingXxXSeleniumXXxXJavaxXAutomationX";
		
		String dt[]=data.split("xX");
		System.out.println(Arrays.toString(dt));
		System.out.println(dt[0]);
		System.out.println(dt[2]);
		
		System.out.println("----------------------------------------------------------------");
		
		
		String sp="TESTING | Automation | CYPRESS | SELENIUM";
		String spp[]=sp.split("\\|");
		
		System.out.println(spp[0]);
		System.out.println(Arrays.toString(spp));
		
		String java="I love \"java\" coding";
		System.out.println(java);
		
		String javac="I love 'java' coding";
		System.out.println(javac);
		
		String xpath="//input[@id='twotabsearchtextbox']";
	}

}

package Stringmanipulations;

import java.util.Arrays;

public class Stringman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is a java program";
		
		System.out.println(str.length());

		System.out.println(str.charAt(21));
		
		System.out.println(str.indexOf("a"));
		
		System.out.println(str.indexOf("a", str.indexOf("a")+1));
		//System.out.println(str.indexOf("a"+1, str.indexOf("a")));
		
		
		String msg="  Welcome admin  ";
		
		if(msg.indexOf("admin")==8) {
			System.out.println("username is found");
		}
		else {
			System.out.println("username nt found");
		}
		
		
		System.out.println(msg.toUpperCase());
		
		
		System.out.println(msg.trim());
		
		String dob="01-01-1990";
		
		System.out.println(dob.replace("-", "/"));
		
		System.out.println("automation".replace("a", "p"));
		
		System.out.println("I love testing".replaceAll("love", "like"));
		
		
		String s="welcome admin";
		System.out.println(s.contains("Admin"));
		
		
		
		
		
		
		String lang="JAVA_PYTHON_JAVASCRIPT_RUBY";
		String langs[]=lang.split("_");
		
		System.out.println(langs[0]);
		System.out.println(Arrays.toString(langs));
		
		
		String data="xXTestingXXxXSeleniumxXxXPOSTMAN";
		String d[]=data.split("xX");
		System.out.println(d[0].length());
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		System.out.println(Arrays.toString(d));
		
		
		String rest="testing | python | cypress| selenium";
		String r[]=rest.split("\\|");
		
		System.out.println(r[0]);
		System.out.println(r[1]);
		System.out.println(r[2]);
		
		
		String word="I love \"java\" coding";
		
		System.out.println(word);
		
		String xpath="//input[@id=\"firstname\"]";
		System.out.println(xpath);
		
		
		
		
		
	}

}   
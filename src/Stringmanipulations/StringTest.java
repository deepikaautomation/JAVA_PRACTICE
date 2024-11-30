package Stringmanipulations;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "naveen";//scp 1 object   //String literal
		String s2= "Automation  naveen"; // 0 object s2 refers to scp
		String s1=new String("FFFF");  //using new keyword
		String s3="FFFF";
		
		System.out.println(s1==s3);
		s1=s1.intern();
		System.out.println(s1==s3);
		
		System.out.println(s2.strip());
		//String r1=new String("Selenium");
		String t1="Selenium";
		
		  System.out.println(s2.trim());
    System.out.println(t1+"api");
    
    System.out.println(t1);
		
		int i=10;
		 System.out.println(i+20);
		 System.out.println(i);
		//System.out.println(t1.intern()==r1.intern());
		
		
		
	}

}

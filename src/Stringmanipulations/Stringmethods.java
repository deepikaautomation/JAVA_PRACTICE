package Stringmanipulations;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Deepika";  //this object gets stored in String constant pool which is in the heap,
		                       //s1 referral variable goes to Stack 
		       
       String s2=new String("Deepika");//the object creates in the heap memory and one copy in SCP.s2 
                             //referal variable goes to stack and this s ponted to object in the heap, that is 2 object is created

       
       System.out.println(s1);
       System.out.println(s2);
       
       System.out.println(s1==s2);
       
       System.out.println(s1.equals(s2));
       
       String s3=new String("Selenium");
       s3=s3.intern();
       System.out.println(s3);
       
       System.out.println(s3 + "DD");
       System.out.println(s3);
       
       
       
       StringBuilder sb=new StringBuilder("Automation");
       sb.append(s3);
       System.out.println(sb);
       
       
       StringBuffer sf=new StringBuffer("Testing");
       sf.append(s3);
       System.out.println(sf);
	}                  

}

package Stringmanipulations;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="200";
		System.out.println(str+20);
		
		//String to integer
		Integer inn=Integer.parseInt(str);
		
		System.out.println(inn+20);
		
		
		
		String ab="200fgg";
		
		try{
		   int aa=Integer.parseInt(ab);
		   System.out.println(aa);
		}
		catch(NumberFormatException nf) {
			nf.printStackTrace();
			
		}
		
		
		
		
		
		
		int i=455;
		System.out.println(i+"A");
		
		
		String dd=String.valueOf(i);
		System.out.println(dd+"A");
		
		
		String execute="true";
		
		Boolean b=Boolean.parseBoolean(execute);
		
		
		if(b) {
			
			System.out.println("I am"+b);
		}
		
		
		Boolean bb=true;
		
		String flag=String.valueOf(bb);
		
		System.out.println("I am"+bb);
		
		
		String ss=" ";
		System.out.println(ss.isBlank());
		System.out.println(ss.isEmpty());
		
		

	}

}

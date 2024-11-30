package Stringmanipulations;

public class DataConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="200A";

		s=s.replace("A", "");
		int i=Integer.parseInt(s);

		System.out.println(i+120);

		String s1="200.99";

		double d=Double.parseDouble(s1);

		System.out.println(d+120);
		
		System.out.println(Byte.MAX_VALUE);
		
		int p=200;
		
		System.out.println(p+120);
		
		
		String pp=String.valueOf(p);
		
		System.out.println(pp+120);
		
		String tr="";
		System.out.println(tr.length());
		System.out.println(tr.isBlank());
		System.out.println(tr.isEmpty());
		
		
		String tr1=" ";
		System.out.println(tr1.length());
		System.out.println(tr1.isBlank());
		System.out.println(tr1.isEmpty());
		
	}

}

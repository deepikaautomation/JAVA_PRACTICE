package Practicejava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Arraysto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String st[]= {"a","b","c"};
	String stjoin=String.join("||",st);
	System.out.println(stjoin);
	
	System.out.println(Arrays.toString(st));
	System.out.println(Arrays.asList(st));
	String a=Arrays.asList(st)
	          .stream()
	          .collect(Collectors.joining(""));
	System.out.println(a);
	

	
	System.out.println("--------------------------");
	
	String x="abc";
	String y="abc";
	x=x.concat(y);
	//System.out.println(x.concat(y));
	System.out.println(x);
	System.out.println(y);
	
	System.out.println("--------------------------");
	
	
	
	String ff[]= {"ee","pp","ooo"};
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<ff.length;i++) {
		sb=sb.append(ff[i]);
	}
	System.out.println(sb);
	
	
	}

}

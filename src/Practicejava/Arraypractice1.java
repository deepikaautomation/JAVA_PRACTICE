package Practicejava;

import java.util.Arrays;

public class Arraypractice1 {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]= {"John","Tom","Walter","Disney","Ivan"};
		
		for(String ename:names) {
			System.out.println(ename);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("-------------------------------");
		System.out.println(Arrays.asList(names));
		
		System.out.println(Arrays.toString(names));
		
		System.out.println("-------------------------------");
		
		
		Object obj[]=new Object[5];
		obj[0]="Deepika";
		obj[1]=23;
		obj[2]="Trivandrum";
		obj[3]="SWE";
		obj[4]=5.5;
		
		System.out.println(Arrays.asList(obj));
		
		//System.out.println(obj[5]);
		
		for(Object e:obj) {
			System.out.println(e);
		}
		

	}

}

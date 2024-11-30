package CODINGEXCERCISE;

import java.util.Scanner;

public class Fibnocci {
	
	
	public static void fibnocciSeries(int n) {
		
		int a=0;
		int b=1;
		
		for(int i=1;i<=n;i++) {
			System.out.println(a  + "  ");
			
			int nextnum=a+b;
			
			a=b;
			b=nextnum;
		}
		
		
	}

	public static void main(String[] args) {
		
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter number : " );
		
		//String n=scanner.nextLine();
		//int n1=Integer.parseInt(n);
		// TODO Auto-generated method stub
		fibnocciSeries(10);

	}

}

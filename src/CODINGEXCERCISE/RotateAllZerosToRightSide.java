package CODINGEXCERCISE;

import java.util.Arrays;

public class RotateAllZerosToRightSide {
	
	
	public static int[] rotateZerosRight(int[] a) {
		
		if(a.length==1) {
			return a;
		}
		
		int[] num=new int[a.length];
		int count=0;
		
		for(int number:a) {
			
			if(!(number==0)) {
				num[count]=number;
				count++;
				
				
			}
		}
		return num;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,0,2,0,3,0,0,0};
		System.out.println(Arrays.toString(rotateZerosRight(a)));
		
		
		a= new int[]{1};
		System.out.println(Arrays.toString(rotateZerosRight(a)));
		

	}

}

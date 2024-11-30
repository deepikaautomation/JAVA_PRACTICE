package CODINGEXCERCISE;

import java.util.Arrays;

public class RemoveDuplicatesfromArray {
	
	
	public static int[] removeDuplicateElements(int[] arr) {
		
		int index=0;
		int n=arr.length;
		int[] temp=new int[n];
		
		for(int i=0;i<n;i++) {
			
			boolean dupflag=false;
			int j;
			
			for( j=0;j<index;j++) {
				
				if(arr[i]==temp[j]) {
				    dupflag=true;
					break;
				}
				}
				
				
				if(!dupflag) {
					
					temp[index++]=arr[i];
					
				}
			
			
			
			
		}
		
		int[] result=new int[index];
		
		System.arraycopy(temp, 0, result, 0, index);
		return result;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2, 3, 1, 4, 5, 2, 6, 7, 3};
		
		int[] result=removeDuplicateElements(array);
		
	    System.out.println(Arrays.toString(result));
	    
		
		

	}

}

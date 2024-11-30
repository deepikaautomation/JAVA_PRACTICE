package Arraylistlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListttttaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> iss= Arrays.asList(1,2,4,7);
		// System.out.println(iss);
		 
		// iss.add(10);
		
	List<Integer> iss=new ArrayList<Integer>( Arrays.asList(1,2,4,7));
	System.out.println(iss);
	iss.add(10);
	System.out.println(iss);
	
	iss.set(0, 23);
	
	System.out.println(iss);
	
	iss.remove(1);
	System.out.println(iss);
	}

}

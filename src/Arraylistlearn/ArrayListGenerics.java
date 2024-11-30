package Arraylistlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListGenerics {

	
	 
     
	 public static void main(String[] args) {
		
		 List<String> ars = new ArrayList<String>();
		 ars.add("DDDDD");
		 
	   ars.addAll(Arrays.asList("dfdf","trtrrt","DDDDD"));
	    
	    System.out.println(ars.get(1));
	    System.out.println(ars);
	    
	    
	    Collections.sort(ars);
	    System.out.println(ars);
	    System.out.println(ars.get(1));
	    
	    
	    Collections.sort(ars,Collections.reverseOrder());
	    System.out.println(ars);
	    
	    Collections.swap(ars, 1, 2);
	    System.out.println(ars);
	    for(String e:ars) {
	    	
	    }
	 }
	 
	  
    
	
	
}

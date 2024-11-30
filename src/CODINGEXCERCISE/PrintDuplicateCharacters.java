package CODINGEXCERCISE;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacters {
	
	
	
	
	public static Map<Character, Integer> printDuplicates(String  st) {
		
		char[] chArray=st.toCharArray();
		
		Map<Character,Integer> charDup=new HashMap<Character,Integer>();
		//Map<Character,Integer> charUniq=new HashMap<Character,Integer>();
		
        for(Character e:chArray) {
        	
        	if(charDup.containsKey(e)){
        		
        		charDup.put(e, charDup.get(e)+1);
        		
        		
        	}
        	else {
        		charDup.put(e, 1);
        }
        	
        	
        
        	
        }
		return charDup;
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(printDuplicates("DDDeeppikaaa"));
		

	}

}

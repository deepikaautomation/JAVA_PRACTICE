import java.io.*;
import java.util.*;

public class Solution {
	
	static void chkException() {
		 Scanner sc=new  Scanner(System.in);
	        try{
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            System.out.println(x/y);
	            
	        }
	        catch(ArithmeticException e){
	            e.printStackTrace();
	            System.out.print("java.lang.ArithmeticException: / by zero");
	            
	        
	            
	        }
	        catch(InputMismatchException e){
	            e.printStackTrace();
	            System.out.println("java.util.InputMismatchException");
	        }
	    }
	

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Solution.chkException();
       
    	
}
}


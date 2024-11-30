package Abstraction;

import ExceptionHandling.MyOwnException;

public class TestAbstraction {

	
	
	
	
	String name="ddd";
	
	public void test() {
		
		int arr[]= {1,3,5,6};
		
		int i=arr[5];
		
	    throw new MyOwnException("dadsdsd");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//TestClass tc=new TestClass();
		
		
		
		System.out.println("ffff");

		TestAbstraction tt=new TestAbstraction();
		
		
		tt.test();
		tt=null;


		try {
			int i=9/3;
			
			tt.name="ff";
			String abc=tt.name;
		}
		
		  catch(ArithmeticException | NullPointerException e) {
		  
			  
			  
		 // System.out.println("ArithmeticException"); 
			  e.printStackTrace();
		  
		  }
		 
		


		System.out.println("ffff");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}

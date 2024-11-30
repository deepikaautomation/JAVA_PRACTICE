package ExceptionHandling;

public class Customer {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub\



		Customer obj=new Customer();

		obj=null;




		try {
			int j= 9/0;
			obj.name="Tom";


			
			System.out.println("Exception handling");


		}
		catch(ArithmeticException e){
			//System.out.println("Arithemtic exception");
			e.printStackTrace();


		}
		catch(NullPointerException e){
			//System.out.println("Arithemtic exception");
			e.printStackTrace();
			
			
		}


	}

}

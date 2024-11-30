package ExceptionHandling;

public class Throwssecond {



	public void login() {

		System.out.println("login site");
		
		try {
			int i=9/0;
			System.out.println("login site");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally exceuted");
		}



	}

	public void addTocart() {
		System.out.println("added to cart");


		try {
			payment() ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			System.out.println("system");
		}
	}

	public void payment() throws Exception {
		System.out.println("payment");
		sbipayment();

	}


	public void sbipayment() throws Exception{

		int i=9/0;
		System.out.println("sbi payment");

	}
	public static void main(String[] args) {


		Throwssecond ts=new Throwssecond();
ts.login();

		//ts.addTocart();
		System.out.println("Ecommerce completed");	




	}
}

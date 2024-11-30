package builderPateern;

public class Esite {
	
	public Esite login() {
		
		System.out.println("Login with username and pwd");
		 return this;
		
	}
	
   public Esite login(String usname, String pwd) {
		
		System.out.println("Login with username " + usname + "and pwd " + pwd);
	     return this;
	}
   
   public Esite search() {
		
		System.out.println("Search default");
		return this;
	}
   public void Search(String pdtname, int price) {
		
		System.out.println("Serached " + pdtname + "and price " + price);
	}
   
  
   
   public void payment(String cardno) {
	   System.out.println("Payment with Creditcard  " + cardno);
   }

   public void payment(int upi) {
	   System.out.println("Payment with Creditcard  " + upi);
   }
   public Esite addtocart(String pdtname) {
		
		System.out.println("Successfully added  " + pdtname);
		return this;
	}


}

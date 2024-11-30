package builderPateern;

public class Ecommerce {
	
	public Ecommerce login(String username, String password) {
		System.out.println("User logged in with " + username +" and  " + password  );
		return this;
		
	}
	
	public Ecommerce search() {
		System.out.println("Search with itemname and price");
		return this;
	}
	
	public Ecommerce search(String Itemname, double price) {
		System.out.println("Items found with name and price" + Itemname );
		return this;
	}
	
	public Ecommerce addToCart() {
		System.out.println("Items are added in the cart");
		return this;
	}
	
	public Ecommerce makepayment() {
		System.out.println("Choose the card type");
		return this;
	}
	
	public Ecommerce generateInvoice() {
		System.out.println("Invoice generated");
		return this;
	}
	
	public void logout() {
		System.out.println("user logged out successfully");
		//return this;
	}
	
	

}

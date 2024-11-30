package builderPateern;

public class EcommerceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ecommerce obj=new Ecommerce();
		obj.login("quser", "user123")
				.search()
					.search("Book", 45.98)
						.addToCart()
							.makepayment()
								.generateInvoice()
									.logout();



	}

}

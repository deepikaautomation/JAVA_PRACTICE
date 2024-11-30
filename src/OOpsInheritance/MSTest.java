package OOpsInheritance;

public class MSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MS0012 ms12=new MS0012();
		ms12.products();
		ms12.trace();
		ms12.permission();
		System.out.println("-----------------------------------------------------");
		
		P2D000 p2d=new MS0012();
		p2d.permission();
		
		MS0000 ms00=new MS0012();
	   ms00.users();
	  // ms00.permission();
	   ms00.groupNetworking();
	   //ms00.users();
	   ms00.permission();
	   ms00.roles();
       
	   
	//   MS0012 ms=(MS0012)new MS0000(); //throws run time error ClassCastExcepton
	   
	   
	
	   }

}

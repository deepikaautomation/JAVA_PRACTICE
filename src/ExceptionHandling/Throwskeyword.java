package ExceptionHandling;

public class Throwskeyword {
	
	
	public void m1() {
	
		System.out.println("I am m1");
		m2();
	}
	
	public void m2()  {
		
		System.out.println("I am m2");
		try{
			m3();
	}catch(ArithmeticException e) {
		e.printStackTrace();
	System.out.println(e.getMessage());
	System.out.println(e.toString());
	}
		
	}
	
	public void m3() throws ArithmeticException {
		
		
		int i=9/0;
		System.out.println("I am m3");
	//try{
		//int i=9/0;
	//}
		//catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throwskeyword th=new Throwskeyword();
		
		
		th.m1();
		System.out.println("bye");

		
	}

}

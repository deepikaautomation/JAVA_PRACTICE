package ExceptionHandling;

public class Restt {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("thow keyword");
		String data=null;
		
		if(data==null) {
			
			throw new MyOwnException("exception handled  data");
			
			
		}
		
		System.out.println("thow keyword");

	}

}

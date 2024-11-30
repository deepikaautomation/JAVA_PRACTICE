package ExceptionHandling;

public class Exceptiontest {
	
	String name="a";

	public void m1()  {
		 System.out.println("m1");
		 String name =m2();
		 System.out.println(name);
	}

	public String m2()  {
		 System.out.println("sm2");
		

		 try {
			m3();
			//System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
		 System.out.println("finally exected");
			 
		 }
		
		 return "DDD";
	}

	public void m3() throws Exception {
		 System.out.println("m3");
		 
		
		 int i=9/3;
		

	}
	
	public void m4() {
		System.out.println(name);
		name=null;
		System.out.println(name);
	throw new MyException("yeah my exception");
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Exceptiontest et=new Exceptiontest();
		et.m1();
		 System.out.println("m3 after exception");
        et.m4();
        
        //Thread.sleep(0);
	}

}

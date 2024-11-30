package constructorbasics;

public class CallbyRef {
	
	String name;
	int age;
	
	
	public  static void test(CallbyRef b1) {
		
		//System.out.println(t1.name + t1.age);
		
		System.out.println(b1.name);
		
		
	}
   public   void test1() {
		
		//System.out.println(t1.name + t1.age);
		System.out.println(name);
	
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyRef obj=new CallbyRef();
		
		obj.name="Deepika";
		obj.age=37;
		
		CallbyRef.test(obj);
		
		
		
		

	}

}

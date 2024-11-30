
public class ClassA {
	
	int age=23;
	String name="Deepika";
	
	
	static int pin=89;
	static String address="Trivandrum";
	
	
	public void sum(int num1, int num2) {
		
		int sum;
		sum=num1+num2;
	    System.out.println(sum);
		
		
	}
	
   public int sum1(int num1, int num2) {
		
		int sum;
		sum=num1+num2;
	    //System.out.println(sum);
		return sum;
		
	}
   
   public static int sum2(int num1, int num2) {
		
		int sum;
		sum=num1+num2;
	    //System.out.println(sum);
		return sum;
		
	}
	
	
	
	
	//System.out.println(name + "   " + age);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA obj1=new ClassA();
		
		obj1.sum(10,20);
		
		int result=obj1.sum1(50, 60);
		System.out.println(result);
		
		System.out.println(obj1.name + "   " +obj1.age);
		
		System.out.println(ClassA.address);
		System.out.println(address);
		
		ClassA.sum2(23, 45);
		
		sum2(12,99);
		
		
		ClassA bobj=new ClassA();
		bobj.sum(34, 43);
		
		bobj=null;
		System.out.println(bobj.name);

	}

}

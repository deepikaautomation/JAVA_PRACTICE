
public class assignments {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
	
		assignments u1=new assignments();
		u1.name="Arti";
		u1.age=21;
		u1.city="Pune";
		
		assignments u2=new assignments();
		u2.name="Sanju";
		u2.age=22;
		u2.city="Kerala";
		
		
		assignments u3=new assignments();
		u3.name="Samson";
		u3.age=25;
		u3.city="Mumbai";
		
		assignments u4=new assignments();
		u4.name="Isha";
		u4.age=24;
		u4.city="Delhi";
		
		System.out.println("I am " + u1.name + "   age of " + u1.age + " from "+ u1.city);
		System.out.println("I am " + u2.name + "   age of " + u2.age + " from "+ u2.city);
		System.out.println("I am " + u3.name + "   age of " + u3.age + " from "+ u3.city);
		System.out.println("I am " + u4.name + "   age of " + u4.age + " from "+ u4.city);
		
		System.out.println("-------------------");
		
		System.out.println("--ASSIGNING U1= U2-----------------");
		
		u1 =u2;
		System.out.println("I am " + u1.name + "   age of " + u1.age + " from "+ u1.city);
		
		System.out.println("--ASSIGNING U2= U3-----------------");
		
	    u2=u3;
	    System.out.println("I am " + u2.name + "   age of " + u2.age + " from "+ u2.city);
  	    
        System.out.println("--ASSIGNING U3= U4-----------------");
		
	    u3=u4;
	    System.out.println("I am " + u3.name + "   age of " + u3.age + " from "+ u3.city);
	    System.out.println("I am " + u4.name + "   age of " + u4.age + " from "+ u4.city);
	    
	    
        System.out.println("--ASSIGNING U4= U1-----------------");
		
	    u4=u1;
	    System.out.println("I am " + u4.name + "   age of " + u4.age + " from "+ u4.city);
	    System.out.println("I am " + u1.name + "   age of " + u1.age + " from "+ u1.city);
		
		
		
		

	}

}

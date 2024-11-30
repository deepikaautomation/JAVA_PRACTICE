package Practicejava;

public class Methodoverloading {
	
	public  final static  int i=5;
	
	
	public void test() {
		System.out.println("First method");
	}

	
	public void test(int num) {
		System.out.println("First method with parametere" + num);
		
		System.out.println(i);
	}
	
	public void test(int num,String s1) {
		System.out.println("First method with parametere" + num + " " +s1) ;
	}
	
	public void test(String s1,int num) {
		System.out.println("First method with parametere" + num + " " +s1) ;
	}
	
	public static void test(String s1) {
		System.out.println("First method with parametere" + s1 + " " +s1) ;
	}
	
	public static void test(String s1,double d) {
		System.out.println("First method with parametere" + s1 + " " +s1) ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading mo=new Methodoverloading();
		mo.test();
		mo.test(i);
		mo.test(10, "Test");
		mo.test("Java", 20);
		Methodoverloading.test("abc");
		
		test("sdd");
		
		
		 new Methodoverloading();

	}

}

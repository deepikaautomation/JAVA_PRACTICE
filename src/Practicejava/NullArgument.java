package Practicejava;

public class NullArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nullarg(null);
		nullarg(null);

	}
	
	public static void nullarg(String name) {
		
		System.out.println("I am string method  " +name);
		
	}

 public static void nullarg(Object name) {
		
		System.out.println("I am Object  method  "+name);
		
	}
}

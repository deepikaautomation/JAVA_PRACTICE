package Practicejava;

import java.util.Arrays;

public    class Aa {
	
	int age;
	String name;
	
	private String empname;
	private int empage;
	
	
	
	public  void mx() {
		System.out.println("Method of Final class A"  +  name);
		
		age=10;
		final  int id=68;
		
		int num=11;
		 final int onm=0;
		 
		 System.setProperty(name, empname)
		
			
	}
	
public  static void mx(String str, Aa t) {
	System.out.println(str);
	System.out.println(t.age);
}

public static  void mx(int str) {
	System.out.println(str);
}

public Aa() {
	System.out.println(" am calld");
}
public Aa(String name) {
	
	this.name=name;
	System.out.println(name +  "   am calld");
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public int getEmpage() {
	return empage;
}

public void setEmpage(int empage) {
	this.empage = empage;
}

}

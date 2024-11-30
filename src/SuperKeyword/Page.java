package SuperKeyword;

public class Page {
	
	String name;
	int age;
	

	public Page() {
		this("Deepika",34);
		System.out.println(" am  a default constructor");
	}
	
	
	public Page(String name, int age) {
		//this();
		System.out.println("2 param constructor");
	}
	
	
	
}

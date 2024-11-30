package SuperKeyword;

public class NewPage {
	
	
	String name;
	String title;
	
	
	public NewPage() {
		
		//this("API","RestAssured");
		
		System.out.println("Default Constructor---");
		
	}
	public NewPage(String name, String title) {
		
		//this();
		this.name=name;
		this.title=title;
		
		System.out.println("Parametised constuctor ---" + name + "" + title);
	}

}

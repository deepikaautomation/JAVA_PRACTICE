package Webdriver_Architecture;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ChromeDriver driver=new ChromeDriver();
		
		String browsername="ie";
		Webdriver driver=null;
		
		
		switch(browsername.toLowerCase().trim()) {
		
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "safari":
			driver=new SafariDriver();
			break;
			
		default:
			
	     //s System.out.println("Invalid browsername");
	      
	      throw new Myexception("Invalid browser");
		}
		System.out.println("Invalid dee");
		
		driver.get("htt://amazon.com");
		String title=driver.getTitle();

		if (title.equals("amazon")){
			
			System.out.println("Title is correct");
		}
			else {System.out.println("Title is incorrect");}
		
		driver.findElement("cssselector//dropsowb");
		driver.findElements("list");
		
		driver.sendKeys("username", title);
		
			
			
		
	}

}

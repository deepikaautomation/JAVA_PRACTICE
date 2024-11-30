package Webdriver_Architecture;

public class SafariDriver implements Webdriver{
	
	public SafariDriver() {
		System.out.println("SafariDriver lanched");
	}

	@Override
	public void findElement(String name) {
		// TODO Auto-generated method stub
		System.out.println("FindElement" + name);
		
	}

	@Override
	public void findElements(String name) {
		// TODO Auto-generated method stub
		System.out.println("FindElements" + name);
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("launching url" + url);
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "amazon";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("clicking on element" + element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		// TODO Auto-generated method stub
		System.out.println("Sendkeys" + value + "in" + element);
		
	}


}

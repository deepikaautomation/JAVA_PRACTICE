
public class Browser {
	
	public boolean launchBrowser(String browserName) {
		
		boolean flag=true;
		switch (browserName.toLowerCase()){
		case "chrome":
			System.out.println("Chrome browser launched");
			//return true;
			break;
		
		case "firefox":
			System.out.println("firefox browser launched");
			//return true;
			break;
			
		case "safari":
			System.out.println("safari browser launched");
			//return true;
			break;
			
	    default :
			System.out.println("Enter right browser");
			flag= false;
			break;
		}
		
		return flag;
	}
	
			
		
		
	

	private void Switch(String browserName) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Browser br=new Browser();
          boolean flag=br.launchBrowser("abvcfg");
          System.out.println(flag);
	}

}

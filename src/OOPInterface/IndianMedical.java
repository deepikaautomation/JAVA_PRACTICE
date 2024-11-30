package OOPInterface;

public interface IndianMedical extends WHO{
	
	int minfee=100;
	public void cardioServices() ;
	
	public void pediatricServices() ;
	
	public void familyclinicServices() ;
	
	public void emergencyServices();
	
	default void test() {
		System.out.println("default methods");
	}
	
  

}

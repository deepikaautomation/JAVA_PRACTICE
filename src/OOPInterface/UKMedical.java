package OOPInterface;

public interface UKMedical extends WHO {
	
	
	public void urologyServices() ;
	
	public void orthoServices() ;
	
	public void entServices() ;
	
	public void entServices(String result);
	
	public void emergencyServices();
	
	
	
	public static void radiography() {
		
		System.out.println("Radiography in Medical");
	}
	
	default void helpDesk() {
		System.out.println("Help in UKMedical");
		
	}
	

}

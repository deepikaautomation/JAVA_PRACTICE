package OOPInterface;

public class FortisHospital extends HospitalOrg implements USMedical, UKMedical,IndianMedical {
	
	int minfee=50;

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...US ----PHYSIO");
		
	}

	@Override
	public void oncoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...US ----ONCOLOGY");
		
	}

	@Override
	public void dermaServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...US ----DERMATOLOGY");
		
	}

	@Override
	public void urologyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...UK ----UROLOGY");
		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...UK----ORTHO");
		
	}

	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...UK ----ENT");
		
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...IN ----CARDIO");
		
	}

	@Override
	public void pediatricServices() {
		// TODO Auto-generated method stub
		System.out.println("FH...IN ----PEDIATRIC");
		
	}

	@Override
	public void familyclinicServices() {
		System.out.println("FH...IN ----FAMILY CLINIC");
		
	}

	//common for all interfaces
	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH... ----Emermgncy");
		
	}
	
	public void medicalTraining() {
		System.out.println("FH... 	Medical training ");
		
	}
	
	public void pathologyservices() {
		System.out.println("FH... 	Pathology ");
		
	}

	@Override
	public void entServices(String result) {
		// TODO Auto-generated method stub
		
		System.out.println("FH... UK	entServices "  + result);
		
	}
	
	
	@Override
	public  void helpDesk() {
		System.out.println("Help in FortisMedical");
		
	}

	@Override
	public void healthRights() {
		// TODO Auto-generated method stub
		System.out.println("Health Rights from WHO");
		
	}


}

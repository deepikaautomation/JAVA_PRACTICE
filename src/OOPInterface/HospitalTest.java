package OOPInterface;

import OOpsInheritance.MS0000;

public class HospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.dermaServices();
		fh.entServices();
		fh.familyclinicServices();
		fh.medicalTraining();
		fh.oncoServices();
		fh.orthoServices();
		fh.pathologyservices();
		fh.pediatricServices();
		fh.physioServices();
		fh.emergencyServices();
		fh.urologyServices();
		fh.entServices("positive lab result");
		System.out.println(fh.minfee + 10);
		
		fh.hospitalrules();
		
		fh.healthRights();
		
		//Topcasting
		
	    IndianMedical im=new FortisHospital(); //chld class object is referred by a parent class ref variable-topcasting
	    im.cardioServices();
	    im.familyclinicServices();
	    im.pediatricServices();
	    im.emergencyServices();
	    UKMedical.radiography();
	    im.healthRights();
	    //fh.helpDesk();
	    
	   // UKMedical uk=new FortisHospital();
	    //uk.helpDesk();
	    fh.helpDesk();
	   
	    System.out.println(IndianMedical.minfee + 10);
	    
	    im.healthRights();
	    
	    
	   
	    
	    
	    
		

	}

}

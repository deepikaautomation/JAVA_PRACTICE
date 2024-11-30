package constructorbasics;

public class Registration {

	String empName;
	String empEmail;
	int empAge;
	String empCity;
	String empPhone;
	String empDob;
	static final String compName="IBM";




	public Registration(String empName, String empEmail) {

		this.empName = empName;
		this.empEmail = empEmail;
		
	}




	public Registration(String empName, String empEmail, int empAge, String empCity) {

		this.empName = empName;
		this.empEmail = empEmail;
		this.empAge = empAge;
		this.empCity = empCity;
	}




	public Registration(String empName, String empEmail, int empAge, String empCity, String empPhone, String empDob) {

		this.empName = empName;
		this.empEmail = empEmail;
		this.empAge = empAge;
		this.empCity = empCity;
		this.empPhone = empPhone;
		this.empDob = empDob;
	}




	public Registration(String empName, String empCity, String empPhone, String empDob) {

		this.empName = empName;
		this.empCity = empCity;
		this.empPhone = empPhone;
		this.empDob = empDob;
		
	}




	public static void main(String[] args) {


		Registration r1=new Registration("Deepika", "deeps@email.com");
		System.out.println(r1.empName + " , " + r1.empEmail + " , " + r1.empAge + " , " + r1.empCity + " , " + r1.empDob + " , " + r1.empPhone + " , " + compName);
		
		
		Registration r2=new Registration("Ishan", "ishan@email.com", 21, "Missisuaga");
		System.out.println(r2.empName + " , " + r2.empEmail + " , " + r2.empAge + " , " + r2.empCity + " , " + r2.empDob + " , " + r2.empPhone );
		
		Registration r3=new Registration("Mahesh", "mahesh@email.com", 40, "Missisuaga","977868786786","23-10-1986");
		System.out.println(r3.empName + " , " + r3.empEmail + " , " + r3.empAge + " , " + r3.empCity + " , " + r3.empDob + " , " + r3.empPhone );
		
		Registration r4=new Registration("Duva", "Missisuaga", "36456456456", "23-09-2000");
		System.out.println(r4.empName + " , " + r4.empEmail + " , " + r4.empAge + " , " + r4.empCity + " , " + r4.empDob + " , " + r4.empPhone );
		r4.empPhone="9999999999";
		
		System.out.println(r4.empName + " , " + r4.empEmail + " , " + r4.empAge + " , " + r4.empCity + " , " + r4.empDob + " , " + r4.empPhone );
		
	}

}

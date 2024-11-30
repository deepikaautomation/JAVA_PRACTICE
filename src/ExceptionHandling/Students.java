package ExceptionHandling;

public class Students {
	
	
	public static int getMarks(String studentname) {
		
		if(studentname.equals("Deepika")) {
			
			//System.out.println(studentname);
			
			try {
			     int i=9/3;
			     //System.exit(1);
			     return 30;
			     }
			catch(ArithmeticException e) {
				return 20;
			}
			finally {
				System.out.println(studentname);
				return 50;
		}
		}
		else if(studentname.equals("Mahesh")) {
			System.out.println(studentname);
			return 100;
			
		}
		else if(studentname.equals("Ishan")) {
			System.out.println(studentname);
			return 95;
			
		}
		else {
			System.out.println("Student not found");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks=getMarks("Deepika");
		System.out.println(marks);
	}

}

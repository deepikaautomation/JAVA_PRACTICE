package oopsEncapulation;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails st=new StudentDetails();
		st.setName("Tim");
		st.setGrade(10);
		st.setStd(5);
		
		int grade=st.getGrade();
		System.out.println(grade);
		System.out.println(st.getName());
		System.out.println(st.getStd());
		
		
		st.studentsAcheivements();

	}

}

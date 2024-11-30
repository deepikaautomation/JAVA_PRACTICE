package oopsEncapulation;

public class StudentDetails {
	
	private String name;
	private int std;
	private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	private void studAddress() {
		System.out.println("Students Address");
	}
	
	
	public void studentsAcheivements() {
		System.out.println("Students Acheivements");
		studAddress();
	}
	
	

}

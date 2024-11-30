package oopsEncapulation;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setName("Deepika");
		e1.setAge(37);
		e1.setSalary(324467.78);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());

	}

}

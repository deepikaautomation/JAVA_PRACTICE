package constructorbasics;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public Employee() {
		System.out.println("called once the object is created, I am adefault constructor.....");
		
	}
	
	public Employee(String name) {
		//name=name;  this will throw null
		
		this.name=name;
	}
	
	public Employee(int age,double salary) {
		//name=name;  this will throw null
		
		this.age=age;
		this.salary=salary;
	}
	

	public static void main(String[] args) {
		
		Employee emp=new Employee("Deepika");
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		
		Employee emp1=new Employee(25,4567788.00);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		
	

	}

	

}

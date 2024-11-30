
public class study2 {
	
	
	String studentname;
	int age;
    double grade;
    boolean isPass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		study2 st1=new study2();
		st1.studentname="Tom";
		st1.age=10;
		st1.grade=6.5;
		st1.isPass=true;
		
		study2 st2=new study2();
		st2.studentname="Peter";
		st2.age=10;
		st2.grade=3.1;
		st2.isPass=false;
		
		new study2();
		new  study2().studentname="John";
		System.out.println(st2.studentname + " " + st2.age + " " + st2.grade + " " + st2.isPass);
		
		st2=null;
		System.out.println(st2.studentname + " " + st2.age + " " + st2.grade + " " + st2.isPass);

	}

}

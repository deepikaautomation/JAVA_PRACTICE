
public class Testrr {

	public void m1() {
		System.out.println("Yes I am m1");
		m2();
		//t3();

	}
	public void m2() {
		System.out.println("Yes I am m2");
		m3();
	}

	public void m3() {
		System.out.println("Yes I am m3");
		m1();

	}
	public static void t3(){
		System.out.println("Yes I am t3");
		Testrr r1=new Testrr();
		r1.m1();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Yes I am Ishan");
		//Testqq.main(args);

		Testrr obj=new Testrr();
		obj.m1();
		t3();
	}

}

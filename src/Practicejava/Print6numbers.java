package Practicejava;

import java.util.ArrayList;

public class Print6numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> evennumbe=new ArrayList<>();
		ArrayList<Integer> oddnumber=new ArrayList<>();

	

		evennumbe.add(3);
		for(int i=3;evennumbe.size()<6 || oddnumber.size()<6 ;i++) {

			
			if(i%2==0) {
				evennumbe.add(i);
				
			}
			else {
				oddnumber.add(i);
				
			}
			//count++;

		}
		System.out.println(evennumbe);
		System.out.println(oddnumber);
	}  
}



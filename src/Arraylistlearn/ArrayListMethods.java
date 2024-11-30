package Arraylistlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> numlist=new ArrayList<Integer>();
		
		numlist.add(199);
		numlist.add(299);
		numlist.add(399);
		numlist.add(499);
		numlist.add(599);
		numlist.add(699);
		
		System.out.println(numlist.size());
		System.out.println(numlist);
		
		
		numlist.set(3, 400); //set method is used to update or replace 
		System.out.println(numlist.size());
		System.out.println(numlist);
		
		
		numlist.remove(3);
		System.out.println(numlist.size());
		System.out.println(numlist);
		
		
		
		List<String> browserlist=Arrays.asList("chrome","firefox","safari","ie");
		System.out.println(browserlist.size());
		System.out.println(browserlist);
		
		
//		browserlist.add(1, "Opera");//UnsupportedOperationexception
//		System.out.println(browserlist.size());
//		System.out.println(browserlist);
		
		
		ArrayList<String> empname=new ArrayList<String>(Arrays.asList("abc","xyz","tt","oo"));
		System.out.println(empname.size());
		System.out.println(empname);
		
		empname.add(1, "dka");
		System.out.println(empname.size());
		System.out.println(empname);
		
		Collections.sort(empname);
		System.out.println(empname);
		
		
		Collections.swap(browserlist, 1, 3);
		System.out.println(browserlist);
		
	}

}

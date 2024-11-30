import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListPrcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("frrr");
		ar.add(566);
		ar.add(33.99);
		
		ar.add('g');
		ar.add(true);
		
		System.out.println(ar);
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(454);
		ar1.add(566);
		ar1.add(33);
		
		ar1.add(22);
		ar1.add(22);
		
		System.out.println(ar1.size());
		
		//System.out.println(ar1.get(4));
		//ArrayList<int> ar2=new ArrayList<Integer>();
		
		
		
		  for(Integer e:ar1) 
		  { System.out.println(e); }
		 
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("-------------------");
		
		
		
		
		
		System.out.println("-------------------");
		Collections.sort(ar1);
		
		System.out.println(ar1);
		
		System.out.println("-------------------");
         
		
		Collections.sort(ar1,Collections.reverseOrder());
		
		
		
		
		System.out.println(ar1);
		System.out.println("-------------------");
		Collections.swap(ar1, 2, 3);
		
		System.out.println(ar1);
		System.out.println("-------------------");
		
		
		ar1.remove(2);
		System.out.println(ar1);
		
		System.out.println(ar1.get(2));
		
		System.out.println("-------------------");
		ar1.set(2, 55);
		
		System.out.println(ar1);
		
		System.out.println("-------------------");
		ArrayList<String> empname=new ArrayList<String>(Arrays.asList("Divya","Deepika"));
		System.out.println(empname);
		empname.add("NCE");
		System.out.println(empname);
		
	}

}

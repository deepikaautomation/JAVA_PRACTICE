package Stringmanipulations;

import java.util.stream.IntStream;

public class Printnumberswithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveprint(5);
		recursiveprint(1,66);
		
		IntStream.range(1, 101).forEach(e->System.out.println(e));
	}
	
	
	public static void recursiveprint(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			recursiveprint(num);
		}
	}
	
	public static void recursiveprint(int stnum, int endnum) {
		
		if(stnum<=endnum) {
			System.out.println(stnum);
			stnum++;
			recursiveprint(stnum,endnum);
		}
		
	}

}

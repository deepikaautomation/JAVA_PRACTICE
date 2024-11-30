package CODINGEXCERCISE;

public class ReverseEachWordinString {
	
	
	public static String reverseEachWord(String st) {
		String rev=" ";
		String[] starray=st.split(" ");
		
		for(String e:starray) {
			for(int i=e.length()-1;i>=0;i--) {
				rev=rev+e.charAt(i);
				
			}
			rev= rev +" ";
		
		}
		return rev ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result=reverseEachWord("This is my java program");
		System.out.println(result);

	}

}

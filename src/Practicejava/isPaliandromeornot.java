package Practicejava;

public class isPaliandromeornot {
	
public static void main(String[] args) {
	palindrome(4000);
}
	
	
	public static void palindrome(int num) {
		
		int r;
		int sum=0;
		int t;
		t=num;
		
		while(num!=0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			}
		if(sum==t) {
			System.out.println(t + "  is a palindrome number" );
		}
		else {
			System.out.println(t + "   is not a palindrome number" );
		}
	}

}

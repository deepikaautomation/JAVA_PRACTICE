import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int k;
		System.out.println(a + "," +b );
		
		for(int i=2;i<=10;i++) {
			k=a+b;
			
			System.out.println(k + " ,");
			a=b;
			b=k; 
		}
		
		System.out.println("-------------------------------------");
		
		
		getcountofduplicatecharacters("Deepiiikaa");
	}
	
	
	
	
	public static void getcountofduplicatecharacters(String name) {
		
		
		char[] namech=name.toCharArray();
		
		Map<Character,Integer> dupchar=new HashMap<Character,Integer>();
		
		for(Character c:namech) {
			
			if(dupchar.containsKey(c)) {
				dupchar.put(c, dupchar.get(c)+1);
				
			}
			else {
				dupchar.put(c, 1);
			}
			
		}
		System.out.println(dupchar);
		
		
	}
public static int power(int orgnum) {
		
		int count=0;
		
		while(orgnum!=0) {
			
			orgnum=orgnum/10;
			count++;
		}
		return count;
		
	}
	
	public static boolean isArmstrong(int orgnum) {
		
		if(orgnum<0) {
			return false;
			
		}
		if(orgnum>0 || orgnum<=9) {
			return false;
			
		}
		
		
		int powerno=power(orgnum);		
		int sum=0;
		int factor=1;
		int copynum=orgnum;
		
		while(copynum!=0) {
			
			int lastdigit=copynum%10;
			
			factor=factor*lastdigit;
			}
		sum=sum+factor;
		copynum=copynum/10;
		
		if(sum==orgnum) {
			return true;
		}
	
		
		
		
		
		
		
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

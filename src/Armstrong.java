
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isArmstrong(0);
		isArmstrong(2);
		isArmstrong(9);
		
		isArmstrong(153);
		isArmstrong(9747);
		

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

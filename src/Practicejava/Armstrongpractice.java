package Practicejava;

public class Armstrongpractice {
	
	


	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		//	System.out.println(isArmstrong(2));
			//System.out.println(isArmstrong(2));
			//System.out.println(isArmstrong(9));
			
			System.out.println(isArmstrong(103));
			//System.out.println(isArmstrong(9747));
			

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
			if(orgnum>=0 && orgnum<=9) {
				return true;
				
			}
			
			
			int powerno=power(orgnum);		
			int sum=0;
			
			int copynum=orgnum;
			
			while(copynum!=0) {
				
				int lastdigit=copynum%10;
				int factor=1;
				for(int i=0;i<powerno;i++) {
					factor=factor*lastdigit;
				}
				sum=sum+factor;
				copynum=copynum/10;
				}
			
			
			if(sum==orgnum) {
				return true;
			}
		
			
			
			
			
			
			
			return false;
		}

	}

	
	
	
	
	


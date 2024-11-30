package Stringmanipulations;

public class Removeduplicatecharcter {
	
	
	
	public static void removeduplicharcater(String name) {
		int index=0;
		String removed="";
		
		char[] ch=name.toCharArray();
		int i;
		int j;
		for(i=0;i<name.length();i++) {
			
			for(j=0;j<i;j++) {
				if (ch[i]==ch[j]) {
					System.out.println(ch[i]  + "is dupiicate");
				}	
					
					
				
			}
				//if(j == i) {
					//ch[index++]=ch[i];
					
				//}
			}
			
			
			
			
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeduplicharcater("Deeppika");
		
		
	}

}

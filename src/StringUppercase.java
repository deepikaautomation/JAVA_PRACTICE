
public class StringUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="this is my java code code";
		
		String starr[]=st.split(" ");
		String newst="";
		
		for(String e:starr) {
			
			newst=newst+e.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toUpperCase()) + " ";
			
			 //String.valueOf(e.charAt(0)).toUpperCase();
		}
		
		System.out.println(newst);

	}

}

import java.util.HashMap;

public class TestString {
	
	
	public static void reverse(String s) {
		
		char st[]=s.toCharArray();
		int count=1;
		HashMap<Character ,Integer> hm=new HashMap<Character ,Integer>();
		
		for(Character e:st) {
			
			if(hm.containsKey(e)) {
			   hm.put(e, hm.get(e)+1);
			}
			else {
				hm.put(e, 1);
			}
		}
		
		System.out.println(hm);
    
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse("test12pop89java569python");
		reverse("aaabbtttpppp");
		
	
	}

}

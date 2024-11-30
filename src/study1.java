import java.util.Arrays;

public class study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj[]=new Object[4];
		obj[0]="Deepika";
		obj[1]="DR";
		obj[2]=37;
		System.out.println(obj.length);
		
		System.out.println(Arrays.toString(obj));
		for(Object e:obj) {
			System.out.println(e);
		}
	}

}

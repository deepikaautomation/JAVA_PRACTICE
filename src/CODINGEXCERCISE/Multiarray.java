package CODINGEXCERCISE;

public class Multiarray {
	int mincolumn;
	
	public void maxarray() {
	int ab[][]= {{23,18,10},{33,2,17}};
		
		int max=ab[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<=3;j++) {
				//System.out.println(a[i][j]);
				
				if(ab[i][j]>max) {
					max=ab[i][j];
				}
				
			}
			
		}
		System.out.println(max);
	}
	
	public void minarray() {
		int a[][]= {{23,18,10},{33,2,17}};
		
		int min=a[0][0];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				//System.out.println(a[i][j]);
				
				if(a[i][j]<min) {
					min=a[i][j];
					mincolumn=j;
				}
				
			}
			
		}
		System.out.println(min);
		
		int k=0;
		int maxcol=a[0][mincolumn];
		while(k<2) {
			
			if(a[k][mincolumn] > maxcol ) {
				maxcol=a[k][mincolumn];
			}
			k++;
			
		}
		System.out.println(maxcol);
		
			
	}
	
	public Multiarray() {
		System.out.println("I am a constructor");
	}
	// parametrised constructor
	
	public Multiarray(int a, int b) {
		System.out.println("I am a in paranamterised  constructor  "+ a +"," + b);
	}

	public static void main(String[] args) {
		//when ever we create an object, a constructor block is being called
		//constructor name is same as classname, and there will be no return type
		//complier will call default[implicit] constructor, if u have not defined any constructor block
//		this will be used generally to intialize variable or properties
		
		//when you create an oblect with parameters, then the parametre constructor will be called
		Multiarray 	MA=new Multiarray();
		MA.maxarray();
		MA.minarray();
		// TODO Auto-generated method stub
		Multiarray 	MC=new Multiarray(1,1);
		// parametrised constructor
			
		
			 

	}

}

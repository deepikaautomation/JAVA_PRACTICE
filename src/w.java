import java.util.Scanner;
class w {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int n,int p){
       
    	int result = 0;
       try{
           
           if(n>=0 & p>=0){
               
                result=n*p;
               
            
           }
       }
        catch(Exception e){
        	if(n ==0 && p==0 ) {
        		System.out.println("java.lang.Exception: n and p should not be zero.");
        	}
            
        }
       
      return result;
       
       
       
    }



  
    
    public static void main(String[] args) {
    	 w my_calculator = new w();
    	 Scanner in = new Scanner(System.in);
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
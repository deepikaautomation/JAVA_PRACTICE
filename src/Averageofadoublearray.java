
public class Averageofadoublearray {


	double[] num= {3432.789,687.8,78.99};
	public double claculateAverage(double[] numbers) {

		double sum=0.00;
		int count= numbers.length;
		System.out.println(count);
		for(double e : numbers) {

			sum =e + sum ;

		}
		double Average= sum / count;


		return Average;




	}

	public static void main(String[] args) {
		
		Averageofadoublearray avg=new Averageofadoublearray();
		// TODO Auto-generated method stub
		//double result= avg.claculateAverage(new double[]{23.09, 34.99, 87.988});
		
		double result= avg.claculateAverage(avg.num);
		System.out.println(result);


	}

	
}

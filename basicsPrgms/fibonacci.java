package basicsPrgms;

public class fibonacci {
	public int fibonacciSeries(int inputNumber) {
		int i=1,f0=0,f1=1;
		int value=0 ;
		for(i=1;i<=inputNumber;++i) {
			System.out.print(f0 + " + ");
			int sum = f0+f1;
			f0 = f1;
			f1= sum;

			value = sum;

		}
		return value;



	}

}

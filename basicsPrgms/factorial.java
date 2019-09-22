package basicsPrgms;

public class factorial {
	
	//factorial program- for loop
		public int  getFactorial1(int inputNumber) {
			int i,fact =1;
			for(i=1;i<=inputNumber;i++) {
				fact*=i;
			}
			return fact;
		}
		//factorial program while loop
		public int getFactorial2(int inputNumber) {
			int i =1, fact=1;
			while(i<=inputNumber) {
				fact*= i;
				i++;
			}
			return fact;
		}

		//factorial program using recursion
		public int getFactorialRecursion(int inputNumber) {
			if(inputNumber == 0) {
				return 1;
			}
			else {
				return (inputNumber*getFactorialRecursion(inputNumber-1));
			}
		}

}

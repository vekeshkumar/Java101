package basicsPrgms;

public class levelOnePrgms{
	
	public static void main(String args[]) {
		
		basicsPrgms.factorial fac = new basicsPrgms.factorial();
		basicsPrgms.fibonacci fib = new basicsPrgms.fibonacci();
		basicsPrgms.getCentury cent = new basicsPrgms.getCentury();
		basicsPrgms.palindrome palin= new basicsPrgms.palindrome();
		basicsPrgms.wordFrequency freq= new basicsPrgms.wordFrequency();
		

		System.out.println(fac.getFactorial1(5));
		System.out.println(fac.getFactorial2(5));
		System.out.println(fib.fibonacciSeries(4));
		System.out.println(cent.getCenturyFromYear(2019));
		System.out.println(palin.checkPalindrome("aabaa")+"palindrome");
		
		 int fact=1; fact = fac.getFactorialRecursion(5); 
		 System.out.println(fact);
		 System.out.println(freq.getWordFrequencyList());
		

	}
	
}

package basicsPrgms;

public class palindrome {
	//Check whether its a Palindrome or Not
	public boolean checkPalindrome(String inputString) {
		
		/*Step 1: get the Length of the string, form a reverse order then
		then  with original string 
		if it matches 
		palindrome 
		else 
		not a palindrome*/

		 int stringLength = inputString.length();
		 String reverse="";
		 boolean isPalindrome = false;

		 for(int i = stringLength -1; i >= 0; i--){
		   reverse += inputString.charAt(i);	
		 }
		if(inputString.equals(reverse)){
		 return isPalindrome = true;
		}

		return isPalindrome;

	}
}

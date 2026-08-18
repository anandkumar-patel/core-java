package anand.logical;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int number = 131454131;
		int result = isPalindrome(number);
		if (result == number)
			System.out.println(number + " is palindrome");
		else
			System.out.println(number + " is not a palindrome");

	}

	public static int isPalindrome(int number) {
		int newnumber = 0;
		int reminder = 0;
		while (number > 0) {
			reminder = number % 10;
			number = number / 10;
			newnumber = newnumber * 10 + reminder;
		}
		return newnumber;
	}

}

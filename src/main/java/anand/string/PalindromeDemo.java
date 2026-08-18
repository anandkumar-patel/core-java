package anand.string;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		char arr[]=input.toCharArray();
		int len=arr.length;
		System.out.println("The length is :"+len);
		boolean val=true;
		for(int i=0;i<len/2;i++)
		{
			if(arr[i]==arr[len-1-i])
				continue;
			else
			{
				val= false;
				break;
			}
		}
		if(val==true)
			System.out.println(input+" is a palindrome");
		else
			System.out.println(input+" is not a palindrome");
	}

}

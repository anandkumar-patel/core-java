package anand.logical;

import java.util.Scanner;

public class GCDExample {
	  
	  
    private static Scanner scanner;
	public static void main(String args[]){
     
        scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
      
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
        
        System.out.println("LCM of two numbers " + number1 +" and " 
                + number2 +" is :" + findLCM1(number1,number2));
      
    }

    /*
     * Java method to find GCD of two number using Euclid's method
     * @return GDC of two numbers in Java
     */
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
    private static int findLCM1(int number1, int number2) {
    	int lcm=0;
    	for(int i=1;i<=number2;i++){
    		lcm=number1*i;
    		if(lcm%number2==0){
    			break;
    		}
    	}
    	return lcm;
    }   
    private static int findLCM2(int a, int b) {
    	int big=0;
    	int small=0;
    	int lcm=0 ;
    	if (a > b) // check whether a is big or b is big
    	{
    		big = a;
    		small = b;
    	} else {
    		big = b;
    		small = a;
    	}
    	for (int i = 1; i <= big; i++) {
    		if (((big * i) % small) == 0) 
    		{
    			lcm = big * i; // condition to calculate the LCM of two   			
    			break;
    		}
    	}
    	return lcm;
    }
}

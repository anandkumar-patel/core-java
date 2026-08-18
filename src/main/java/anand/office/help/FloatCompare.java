package anand.office.help;

public class FloatCompare {

	public static void main(String[] args) {
		double result = 0.1 + 0.2;
        double expected = 0.3;
        System.out.println(result == expected);
        double epsilon = 1e-10; // Choose an appropriate small value for your application
        boolean areEqual = Math.abs(result - expected) < epsilon;
        System.out.println(areEqual);
        
        
        
        // understanding the epsilon
        
        /**
         * Examples:

  	Large Numbers: Scientific notation is not only used for small 
  	numbers but also for large numbers. 
  	For example, 3e7 means 3 multiplied by 10^7, which is 30,000,000.

    Smaller Exponents: The exponent can also be a positive integer. 
    For example, 2e3 means 2 multiplied by 10^3, which is 2,000.

    Negative Exponents: As in your original question, 
    when the exponent is negative, it represents a small decimal fraction. 
    For instance, 5e-4 means 5 multiplied by 10^(-4), which is 0.0005.
         */
	}

}

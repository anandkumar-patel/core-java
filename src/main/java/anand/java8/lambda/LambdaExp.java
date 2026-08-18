package anand.java8.lambda;

public class LambdaExp {
	
	public static void main(String args[]){
		LambdaExp tester = new LambdaExp();

		//with type declaration
		//1-Variable Declarations
		MathOperation addition = (int a, int b) -> a + b;

		//with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		//with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> { return a * b; };

		//without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	}

	// 2- Method Arguments:
	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}
}



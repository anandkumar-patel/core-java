package anand.java8.lambda;

import java.io.IOException;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Method to check if a number is odd
    public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    // Method to check if a number is prime
    public PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    // Method to check if a number is a palindrome
    public PerformOperation isPalindrome() {
        return (int a) -> {
            String str = Integer.toString(a);
            String reverseStr = new StringBuilder(str).reverse().toString();
            return str.equals(reverseStr);
        };
    }
}

public class LambdaTargetType {
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();

		PerformOperation op;
		boolean ret = false;
		String ans = null;
		int ch = 2;
		int num = 5;
		if (ch == 1) {
			op = ob.isOdd();
			ret = MyMath.checker(op, num);
			ans = (ret) ? "ODD" : "EVEN";
		} else if (ch == 2) {
			op = ob.isPrime();
			ret = MyMath.checker(op, num);
			ans = (ret) ? "PRIME" : "COMPOSITE";
		} else if (ch == 3) {
			op = ob.isPalindrome();
			ret = MyMath.checker(op, num);
			ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
		}
		System.out.println(ans);

	}
}

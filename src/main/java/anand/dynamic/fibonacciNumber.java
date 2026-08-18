package anand.dynamic;

import java.util.HashMap;
import java.util.Map;

public class fibonacciNumber {
	public static void main(String[] args) {
		fibonacciNumber obj = new fibonacciNumber();
		System.out.println(obj.getfibonacci(6));
	}

	public long getfibonacci(int n) {
		if (n < 3)
			return 1;
		// Map to store the previous results
		Map<Integer, Long> computedValues = new HashMap<Integer, Long>();
		// The two edge cases
		computedValues.put(1, 1L);
		computedValues.put(2, 1L);

		return getFibonacci(n, computedValues);
	}

	private long getFibonacci(int n, Map<Integer, Long> computedValues) {
		if (computedValues.containsKey(n))
			return computedValues.get(n);

		computedValues.put(n - 1, getFibonacci(n - 1, computedValues));
		computedValues.put(n - 2, getFibonacci(n - 2, computedValues));

		long newValue = computedValues.get(n - 1) + computedValues.get(n - 2);
		computedValues.put(n, newValue);
		return newValue;
	}

	public long fibonacci(int n) {
		return (n < 3) ? 1 : fibonacci(n - 2) + fibonacci(n - 1);
	}

}

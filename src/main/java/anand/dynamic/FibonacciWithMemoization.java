package anand.dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciWithMemoization {
	static Map<Integer, Long> cache = new ConcurrentHashMap<Integer, Long>();

	public static void main(String[] args) {
		//System.out.println(fibonacciWithMemoization(1));
		HashMapDemo();

	}

	public static long fibonacciWithMemoization(int number) {
		if (number == 0) {
			return number;
		}
		if (number == 1) {
			return 1;
		}
		return cache.computeIfAbsent(number, (n) -> {
			System.out.println("Not Found in Cache, Calculate Fibonacci(" + n + ")");
			return fibonacciWithMemoization(number - 2) + fibonacciWithMemoization(number - 1);
		});
	}
	
	public static void HashMapDemo() {
		Map<Integer, String> data = new HashMap<>();
		data.put(1, "Anand");
		data.put(2, "Kumar");
		data.put(3, "Patel");
		data.put(4, "Uday");
		data.computeIfAbsent(4, (n)-> "Udai");
		data.computeIfAbsent(5, (n)-> "Raj");
		
		System.out.println("Output :"+ data);
		
		
	}

}

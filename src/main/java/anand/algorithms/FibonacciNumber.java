package anand.algorithms;

public class FibonacciNumber {

	public static void main(String[] args) {
		int input = 6;
		System.out.println(input + "th fibonacci is  :" + fib(input, new int[input]));
	}

	public static int fib(int num, int mem[]) {
		if (num == 1 || num == 2)
			return 1;
		else if (mem[num-1] != 0)
			return mem[num-1];
		else {
			int number = fib(num - 1, mem) + fib(num - 2, mem);
			mem[num-1] = number;
			return number;
		}

	}
}

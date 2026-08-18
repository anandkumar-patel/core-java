package anand.java8.functionalinterface;

public class MainMethod {

	public static void main(String[] args) {
		// Implementing Arithmetic interface without using Lambda expression
		Arithmetic obj = new Arithmetic() {
			@Override
			public int operation(int x, int y) {
				return x + y + 12;
			}
		};

		System.out.println("obj.operation(3, 5) " + obj.operation(3, 5));
		System.out.println("obj.sum(3, 5) " + obj.sum(3, 5));
		System.out.println("Arithmetic.sub(3, 5) " + Arithmetic.sub(3, 5));
		System.out.println("Arithmetic.mul(3, 5) "+Arithmetic.mul(3, 5));

		// Implementing Arithmetic interface using Lambda expression
		Arithmetic obj1 = (int a, int b) -> a * b * 2;

		System.out.println("obj1.operation(2, 5) " + obj1.operation(2, 5));
		System.out.println("obj1.sum(2, 5) " + obj1.sum(2, 5));
		System.out.println("Arithmetic.sub(2, 5) " + Arithmetic.sub(2, 5));
		System.out.println("Arithmetic.mul(2, 5) "+Arithmetic.mul(2, 5));
	}
}

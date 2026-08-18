package anand.java8.functionalinterface;

@FunctionalInterface
public interface Arithmetic {

	public int operation(int a, int b);

	
	// default method  ....any number of default method
	default int sum(int a, int b) {
		return a + b;
	}

	// static method  ....any number of static method
	static int sub(int a, int b) {
		return a - b;
	}

	// public static method  ....any number of static method
	public static int mul(int a, int b) {
		return a * b;
	}
}

package anand.nulll;

public class QOnNull3
{
	public static void printMethod(Exception e) {
		System.out.println("Exception");
	}

	public static void printMethod(ArithmeticException ae) {
		System.out.println("ArithmeticException..");
	}

	public static void printMethod(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		printMethod(null);
	}
}

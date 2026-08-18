package anand.nulll;

public class QOnNull1 {
	public static void printMethod(String s) {
		System.out.println("String");
	}

	public static void printMethod(Object s) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		printMethod(null);
	}
}

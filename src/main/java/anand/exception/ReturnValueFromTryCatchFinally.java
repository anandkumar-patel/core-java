package anand.exception;

public class ReturnValueFromTryCatchFinally {
	public static void main(String[] args) {
		System.out.println(methodReturningValue());
	}

	static String methodReturningValue() {
		try {
			return "return value from try block";
		} catch (Exception e) {
			return "return value from catch block";
		} finally {
			return "return value from finally block";
		}
	}
}

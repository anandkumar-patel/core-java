package anand.exception.tricky;

public class Exception3 {

	public static void main(String[] args) {
		System.out.println(anyMethod());
	}

	static String anyMethod() {
		String s = "ONE";
		try {
			s = s + "TWO";
			return s;
		} catch (Exception e) {
			s = s + "THREE";
			return s;
		} finally {
			s = s + "FOUR";
		}
	}
}
